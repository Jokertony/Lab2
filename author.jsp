<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body background="17.jpg">

<h3 onClick="window.location.href='index.jsp'">Return</h3>
<h1>Books Management System </h1>

<form action="/action/delete">
 <table border="1">
     <tr>
         <td>Title</td>
         <td>ISBN</td>

     </tr>
     <s:iterator value="#session.list">
         <tr>
             <td>
                 <s:property value="title"></s:property>
             </td>

             <td>
                 <s:property value="ISBN"></s:property>
             </td>

             <td><a href="/action/delete.action?ISBN=<s:property value="ISBN"/>">delete</a></td>

         </tr>
     </s:iterator>
 </table>
</form>
</body>
</html>
