<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    Exception e = (Exception)request.getSession().getAttribute("SPRING_SECURITY_LAST_EXCEPTION");
    if(e==null){
        e = new Exception();
    }
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="org.springframework.web.context.request.SessionScope"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>无权访问</title>
</head>
<body>
<h3>无权访问</h3>

</body>
</html>