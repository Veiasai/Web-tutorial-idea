<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%--
因为context.xml需要在tomcat中配置，maven的tomcat插件不知为何调不好，以后在试试，先用setDataSource标签代替
<sql:query var="rs" dataSource="jdbc/sample">
  select id, firstname, lastname, phone, email from users
</sql:query>
--%>

<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://yourDBMS url/test"
                   user="root"  password="woshiqiangmima123456"/>

<sql:query var="rs" dataSource="${snapshot}">
    select id, firstname, lastname, phone, email from users
</sql:query>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>DB Test</title>
</head>
<body>
	<h2>Results</h2>
	<c:forEach var="row" items="${rs.rows}"> ID ${row.id}<br />
                      Name ${row.firstname}  ${row.lastname}<br />
                      Password ${row.phone}<br />
                       email ${row.email}<br />
	</c:forEach>
</body>
</html>
