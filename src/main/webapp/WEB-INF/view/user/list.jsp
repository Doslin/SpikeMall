<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${msuserlist }" var="item">
	用户姓名:${item.name },
	用户账号:${item.useraccount },
	用户密码 :${item.userpassword },
	用户性别:${item.usersex },
	用户年龄:${item.userage },
	用户的地址:${item.useraddress },
	用户的邮箱:${item.useremail },</br>
</c:forEach>
</body>
</html>