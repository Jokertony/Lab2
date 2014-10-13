<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <style>


    </style>
</head>
<body background="17.jpg">

<h1>Books Management System </h1>

<div>
    <form action="/action/as_book">
        <table>
            <tr>

                <td><input name="submit" type="submit" value="author"width="30"/></td>
                <td><input name="author" type="text" width="30"/></td>

            </tr>
        </table>
    </form>
    <form action="/action/book_detail">
        <table>
            <tr>
                <td><input name="submit" type="submit" value="title"width="30"/></td>
                <td><input name="title" type="text" width="30"/></td>
            </tr>
        </table>
    </form>

    <table>
        <tr>
            <td><input onClick="window.location.href='newbook.jsp'" name="submit" type="submit"
                       value="add&update"width="30"/></td>
            <td></td>
        </tr>
    </table>
</div>

</body>
</html>