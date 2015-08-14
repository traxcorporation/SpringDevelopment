<?xml version="1.0" encoding="UTF-8"?>
<%@ include file="/WEB-INF/jsp/include.jsp" %>

<%-- Redirected because we can't set the welcome page to a virtual URL. --%>
<c:redirect url="/hello.htm"/>
<html>
  <head><title>Example :: Spring Application</title></head>
  <body>
    <h1>Example - Spring Application</h1>
    <p>Bienvenue it's now <c:out value ="${now}"> </c:out>></p>
  </body>
</html>