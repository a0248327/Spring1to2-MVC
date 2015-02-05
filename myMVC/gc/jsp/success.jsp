<%@taglib prefix="spring" uri="/spring"%>
<%@page contentType="text/html;charset=GBK"%>
<html> 
<head><title><spring:message code="title"/></title></title></head> 
<body> 
<spring:bind path="command.username"> 
        <H3><spring:message code="welcome"/></title>${status.value}<spring:message code="loginSuccess"/></title></H3><br>
    </spring:bind>
</body> 
</html>
