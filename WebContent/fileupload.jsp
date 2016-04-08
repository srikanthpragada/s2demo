<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<s:head />
</head>

<body>
	<h1>File Upload Example</h1>

	<s:form action="uploadFile" method="POST" enctype="multipart/form-data">
		<s:file name="file" label="Select a File to upload" size="40" />
		<s:submit value="submit" name="submit" />
	</s:form>

	<s:if test="message != null">
	    <s:property value="message" />
	    <p/>
	    <s:if test = "file != null">
          File : <s:property value="fileFileName" />
		  <p />
          Type : <s:property value="fileContentType" />
        </s:if>
	</s:if>
	
	
</body>
</html>