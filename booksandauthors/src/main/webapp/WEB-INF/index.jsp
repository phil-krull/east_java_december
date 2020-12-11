<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Books And Authors</title>
</head>
<body>
<h1>All Authors</h1>
<ul>
	<c:forEach items="${authors}" var="author">
		<li>${author.name} wrote:
			<ul>
				<c:forEach items="${author.books}" var="book">
					<li>${book.title }</li>
				</c:forEach>
			</ul>
		</li>
	</c:forEach>
</ul>
<h1>New Author</h1>
<form:form action="/authors" method="post" modelAttribute="author">
    <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form> 

<h1>All Books</h1>
<ul>
	<c:forEach items="${books}" var="book">
		<li>${book.title} written by: ${book.author.name }</li>
	</c:forEach>
</ul>   

<h1>New Book</h1>
<form:form action="/books" method="post" modelAttribute="book">
    <p>
        <form:label path="title">Title:</form:label>
        <form:errors path="title"/>
        <form:input path="title"/>
    </p>
    <p>
    	<form:label path="author">Author:</form:label>
        <form:errors path="author"/>
        <form:select path="author">
		    <form:options items="${authors}" itemValue="id" itemLabel="name"/>
		</form:select>
    </p>  
    <input type="submit" value="Submit"/>
</form:form> 

</body>
</html>