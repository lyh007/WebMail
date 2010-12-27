<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@include file="/common/taglibs.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<base href="<%=basePath%>"/>
<title>Simple jsp page</title>
<link rel="stylesheet" type="text/css" href="/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="/js/easyui/themes/icon.css">
<script type="text/javascript" src="/js/jquery/jquery-1.4.4.js"></script>
<script type="text/javascript" src="/js/easyui/jquery.easyui.min.js"></script>
<div id="aa" class="easyui-accordion" style="width:143px;height:695px;">
    <div title="用户管理" iconCls="icon-ok" style="overflow:auto;padding:10px;" selected="true" >
      添加用户
    </div>
    <div title="系统设置" iconCls="icon-reload" style="padding:10px;">
        content2
    </div>
    <div title="邮件管理">
        content3
    </div>
</div>