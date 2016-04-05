package action;

import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.CachedRowSet;

import com.opensymphony.xwork2.ActionSupport;

import oracle.jdbc.rowset.OracleCachedRowSet;

public class JobsAction extends ActionSupport {
	
	List<Job> jobs;
	
	public String execute() {
		try {
			 CachedRowSet rs = new OracleCachedRowSet();
			 rs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			 rs.setUsername("hr");
			 rs.setPassword("hr");
			 rs.setCommand("select * from jobs");
			 rs.execute();
			 
			 jobs = new ArrayList<>();
			 while ( rs.next()) {
				 Job j = new Job();
				 j.setId( rs.getString("job_id"));
				 j.setTitle( rs.getString("job_title"));
				 jobs.add(j);
			 }
			 
			 rs.close();
			}
			catch(Exception ex) {
			   System.out.println(ex);
			}
		
     		return SUCCESS;
	}
	
	public List<Job> getJobs() {
		
		 return jobs;
	}

}
