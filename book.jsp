<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body background="17.jpg">
<h3 onClick="window.location.href='index.jsp'">Return</h3>
<h1>Books Management System </h1>

    <table border="1">
        <s:iterator value="#session.list">
            <tr>
                <td>ISBN</td>
                <td>
                    <s:property value="ISBN"></s:property>
                </td>
            </tr>
            <tr>
                <td>Title</td>
                <td>
                    <s:property value="title"></s:property>
                </td>
            </tr>
            <tr>
                <td>Publisher</td>
                <td>
                    <s:property value="publisher"></s:property>
                </td>
            </tr>
            <tr>
                <td>Price</td>
                <td>
                    $<s:property value="price"></s:property>
                </td>
            </tr>
            <tr>
                <td>PriceDate</td>
                <td>
                    <s:property value="date"></s:property>
                </td>
            </tr>
            <tr>
                <td>Author</td>
                <td>
                    <s:property value="author"></s:property>
                </td>
            </tr>
            <tr>
                <td>Age</td>
                <td>
                    <s:property value="age"></s:property>
                </td>
            </tr>
            <tr>
                <td>Nation</td>
                <td>
                    <s:property value="nation"></s:property>
                </td>
            </tr>
        </s:iterator>
    </table>

</body>
</html>
