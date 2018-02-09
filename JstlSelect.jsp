<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.ArrayList"%>
<%
    ArrayList<String> list = new ArrayList<String>();
    list.add("A");
    list.add("B");
    list.add("C");
     
    request.setAttribute("alist", list);
%>
<html>
<body>
    <select id="names" name="names">
   <c:forEach items="${alist}" var="names">
        <option value="<c:out value="${names}"/>"><c:out value="${names}"/></option>
    </c:forEach>
</select>
</body>
</html>