<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course Management Application</title>
</head>

	<body bgcolor="orange">
		<h2>Course Details</h2>
		<form action="addCourse" method="POST">
			<pre>
					Course 			: <input type="number" name="cid" />
					Course Name 		: <input type="text" name="cname" />
					Course Provider 	: <input type="text" name="provider" />
					Course Duration 	: <input type="number" name="duration" />
					Course Cost		: <input type="number" name="cost" />
	
							<input type="submit"  value="Add"  name="add"/>   
			</pre>
		</form>
		
		<form action="showCourse" method=POST>
			<pre>
				<input type="submit"  value="Show"  name="show"/>
			
			</pre>
		</form>
	</body>
	

</html>