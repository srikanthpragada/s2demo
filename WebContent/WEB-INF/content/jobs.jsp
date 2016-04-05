<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Jobs</title>
</head>
<body>
	<h1>Jobs</h1>

    <s:iterator value="jobs">
        <s:property value="id" />, <s:property value="title" />
        <br/>
	</s:iterator>
	
	
	<s:iterator value="jobs">
	  <s:if test="titleLength > 10">
         <s:property value="title" />
         <br/>
      </s:if>   
	</s:iterator>
	
	
</body>
</html>