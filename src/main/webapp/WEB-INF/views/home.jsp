<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	
	<link href="./resources/css/home.css" rel="stylesheet">
</head>
<body>
<h1>
	Hello world!
</h1>

<img alt="" width="150" height="150" src="./resources/images/Chrysanthemum.jpg">

<P>  The time on the server is ${serverTime}. </P>
<a href="./notice/noticeList?name=notice">go notice</a>
<a href="./qna/qnaList">go qna</a>
</body>
</html>
