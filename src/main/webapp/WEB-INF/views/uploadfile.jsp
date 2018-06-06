<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelloWorld page</title>
</head>
<body>
    <form action="/pma" enctype="multipart/form-data" method="post">
        File:<br>
        <input type="file" name="file"><br>
        Channel:<br>
        <input type="text" name="channel">
        Delimiter:<br>
        <input type="text" name="delimiter">
        <br>
        <button type="submit" value="submit">Submit</button>
    </form>
</body>
</html>