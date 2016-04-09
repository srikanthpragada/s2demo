<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
           <tiles:insertAttribute name="title" ignore="true" />
        </title>
        <link  href="../styles.css" rel="stylesheet" />
        <s:head />
    </head>
    <body>
    <div class="header">Tiles Demo</div>
    <div class="menu">
      [<a href="page1">Page1</a>] &nbsp;
      [<a href="page2">Page2</a>] &nbsp;
    </div>
    <h2><tiles:insertAttribute name="title"/> </h2>
    <tiles:insertAttribute name="body"/>
</body>
</html>