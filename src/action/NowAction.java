package action;

public class NowAction {
	
	public String getValue() {
		return  new java.util.Date().toString();
	}
	public String execute() {
		return "success";
	}

}
