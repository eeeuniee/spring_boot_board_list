<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<!-- bootstrap을 css cdn -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" type="text/css" />
	
	<!-- jquery cdn -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<!-- //#2 수정	 -->
</head>
<body>
   <div class="container">
   <h2 class="text">게시판목록</h2>
   <table class="table table-striped" width="500" border="1" >
      <tr>
         <td>번호</td>
         <td>이름</td>
         <td>제목</td>
         <td>날짜</td>
         <td>히트</td>
      </tr>
      <c:forEach items="${list}" var="dto">
      <tr>
         <td>${dto.bId}</td>
         <td>${dto.bName}</td>
         <td>
            <c:forEach begin="1" end="${dto.bIndent}">-</c:forEach>
            <a href="content_view?bId=${dto.bId}">${dto.bTitle}</a></td>
         <td>${dto.bDate}</td>
         <td>${dto.bHit}</td>
      </tr>
      </c:forEach>
      <tr>
         <td colspan="5"> <a href="write_view">글작성</a> </td>
      </tr>
   </table>
   
   
   	  <ul class="pagination justify-content-center">
      <c:if test="${pageMaker.prev}">
        	<li class="page-item"><a class="page-link" href="list${pageMaker.makeQuery(pageMaker.startPage - 1) }">«</a>
      </c:if>

      <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }" var="idx">
         <c:out value="${pageMaker.cri.pageNum == idx?'':''}" />
        	<li class="page-item"><a class="page-link" href="list${pageMaker.makeQuery(idx)}">${idx}</a>
      </c:forEach>
      
      <c:if test="${pageMaker.next && pageMaker.endPage > 0}">
        	<li class="page-item"><a class="page-link" href="list${pageMaker.makeQuery(pageMaker.endPage +1) }"> » </a>
      </c:if> 
      </ul>
      </div>
</body>
</html>