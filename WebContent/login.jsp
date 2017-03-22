<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Login App</h1>
	<s:div>
		<s:form namespace="/" action="authentication" method="POST" validate="true">
			<s:textfield name="userName" required="true" label="User Name" labelSeparator=":"/>
			<s:password name="password" required="true" label="Password" labelSeparator=":"/>
			<s:submit />
		</s:form>
		<s:fielderror name="invalid"/>
	</s:div>
</body>
</html>