<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<body>
<h2>Hello World!</h2>
<%  String path = request.getContextPath();%>

<li>contextPath : <%=path%></li>

<p>localport: ${localport}</p>
</body>
</html>
