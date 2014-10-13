<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查找图书</title>
    <style>


    </style>
</head>
<body background="17.jpg">

<h3 onClick="window.location.href='index.jsp'">Return</h3>
<h1>Books Management System </h1>

<div>
    <form action="/action/new_b">
        <table>
            <tr>
                <td>ISBN</td>
                <td><input name="ISBN" type="text" width="30"/></td>
            </tr>
            <tr>
                <td>Title</td>
                <td><input name="title" type="text" width="30"/></td>
            </tr>
            <tr>
                <td>Author</td>
                <td><input name="author" type="text" width="30"/></td>
            </tr>
            <tr>
                <td>Publisher</td>
                <td><input name="publisher" type="text" width="30"/></td>
            </tr>
            <tr>
                <td>Price</td>
                <td><input name="price" type="text" width="30"/></td>
            </tr>
            <tr>
                <td>Date</td>
                <td><input name="date" type="text" width="30"/></td>
            </tr>
            <tr>
                <td>Age</td>
                <td><input name="age" type="text" width="30"/></td>
            </tr>
            <tr>
                <td>Nation</td>
                <td><input name="nation" type="text" width="30"/></td>
            </tr>
            <tr>
                <td></td>
                <td><input name="submit" type="submit" value="add&update"width="30"/></td>
            </tr>
        </table>
    </form>
</div>

</body>
</html>