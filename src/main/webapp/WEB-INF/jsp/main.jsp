<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@include file="/common/taglibs.jsp" %>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="/js/easyui/themes/default/easyui.css">
    <script type="text/javascript" src="/js/jquery/jquery-1.4.4.js"></script>
    <script type="text/javascript" src="/js/easyui/jquery.easyui.min.js"></script>
</head>
<body class="easyui-layout">
<div region="north" border="false" style="height:60px;"><jsp:include page="/common/header_menu.jsp"/></div>
<div region="west" split="true" title="West" style="width:150px;"><jsp:include page="/common/left_menu.jsp"/></div>
<div region="south" border="false" style="height:50px;padding:10px;"><jsp:include page="/common/bottom_menu.jsp"/></div>
<div region="center" title="Main Title">main</div>
</body>
</html>