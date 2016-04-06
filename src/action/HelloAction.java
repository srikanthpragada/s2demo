package action;

import java.util.Date;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Actions({
    @Action("hello"),
    @Action("today")
  })
@Results( {
	 @Result (name="success",location="hello.jsp"),
	 @Result (name="error",location="error.jsp") }
)
public class HelloAction {
	
	String message = "";
	
	public String getMessage() {
		return  message;
	}
	public String execute() {
		message = new Date().toString();
		return "success";
	}

}
