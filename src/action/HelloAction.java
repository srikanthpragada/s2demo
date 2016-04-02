package action;

import java.util.Date;

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
