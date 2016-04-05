<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Update Salary</title>
  <s:head />
</head>
<body>
	<h1>Update Salary</h1>
	<s:form action="updateSalary">
	   <s:textfield name="empid" label="Employee Id"   ></s:textfield>
	   <s:textfield name="salary" label="Salary"></s:textfield>
	   <s:submit value="Update Salary"></s:submit>
	</s:form>
    <h3>
      <s:property value="message" />
    </h3>
</body>
</html>