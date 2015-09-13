<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="javax.servlet.http.HttpServletRequest"  %>
<%
/*chrome不支持js  跨域操作 所以只能获取项目的带域名的地址   然后设置js的 document.domain = 'j1.com' */
StringBuffer url = request.getRequestURL();  
String contextUrl = url.delete(url.length() - request.getRequestURI().length(), url.length()).append(request.getContextPath()).append("").toString(); 
request.setAttribute("contextUrl",contextUrl);
%>
<c:set var="systemTitle" value="任务中心"/>
<c:set var="ctx" value="${contextUrl}" />
<script>
	function getAppPath(){
		return "${ctx}";
	}
	var appPath = "${ctx}";
	//alert(appPath);
	var systemNo = "${systemNo}";
	var systemTitle = "${systemTitle}";
	
</script>
<script type="text/javascript" src="${ctx}/js/lib/jquery/jquery-1.8.3.js" ></script>
