package action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateSalaryAction extends ActionSupport {

	private int empid, salary;
	private String message;
	

	@Override
	public void validate() {
       super.validate();
       if ( empid < 100 )
    	   addFieldError("empid", "Invalid Employee Id");
       
       if ( salary < 1000 )
    	   addFieldError("salary", "Invalid Salary");
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String execute() {
//		System.out.println(empid);
//		System.out.println(salary);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(Exception ex) {
		    message = "Sorry! Unable to connect to database!";
		    return  "failure";
		}

		
		// connect to Oracle
		try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr")) {
			PreparedStatement ps = con.prepareStatement("update employees set salary =? where employee_id = ?");
			ps.setInt(1, salary);
			ps.setInt(2, empid);

			int count = ps.executeUpdate();

			if (count == 1)
				message = "Updated Successfully!";
			else
				message = "Sorry! Employee not found!";
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			message = "Sorry! Some error prevented the process!";
		}
		
		return SUCCESS;
	}

}
