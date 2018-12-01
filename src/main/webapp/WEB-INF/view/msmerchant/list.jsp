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
<c:forEach items="${msmerchantlist }" var="item">
	商家的姓名:${item.merchantname },
	商家的店铺名称:${item.merchantshopname },
	商家账号:${item.merchantaccount },
	商家密码:${item.merchantpassword },
	商家经营范围:${item.merchantscope },</br>

</c:forEach>
</body>
</html>