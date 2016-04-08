<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>SJ Controls Demo</title>
<sj:head />
</head>
<body>

	<sj:autocompleter label="Favourite Colour"
	    name="favColor"
		list="{'red','green','blue','gray','orange','black'}" />
	<br />
	<sj:datepicker name="deliverydate" label="Delivery Date"
		displayFormat="dd/M/yy" />

</body>
</html>