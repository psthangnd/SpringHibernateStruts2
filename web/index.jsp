<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<s:form action="HelloWorld" method="post">
    <s:textfield name="message" />
    <s:submit value="Submit" />
</s:form>