<%--
  Created by IntelliJ IDEA.
  User: mrrre
  Date: 10/25/2024
  Time: 12:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration</title>
    <style>
        .error {
            color: #ff0000;
        }

        .errorblock {
            color: #000;
            background-color: #ffEEEE;
            border: 3px solid #ff0000;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
    <h1>Registration</h1>
    <form:form modelAttribute="registration">
        <form:errors path="*" cssClass="errorblock" element="div" />
        <table>
            <tr>
                <td>
                    <spring:message code="name" />:
                </td>
                <td>
                    <form:errors path="name" cssClass="error" />
                </td>
                <td>
                    <form:input path="name" />
                </td>
            </tr>
            <tr>
                <td colspan="3">
                    <input type="submit" value="Add Registration">
                </td>
            </tr>
        </table>
    </form:form>
</body>
</html>
