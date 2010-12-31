<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@include file="/common/taglibs.jsp" %>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title>系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link rel="stylesheet" type="text/css" href="/js/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/js/easyui/themes/icon.css">
    <script type="text/javascript" src="/js/jquery/jquery-1.4.4.js"></script>
    <script type="text/javascript" src="/js/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript">
        var products = [
            {productid:'FI-SW-01',name:'Koi'},
            {productid:'K9-DL-01',name:'Dalmation'},
            {productid:'RP-SN-01',name:'Rattlesnake'},
            {productid:'RP-LI-02',name:'Iguana'},
            {productid:'FL-DSH-01',name:'Manx'},
            {productid:'FL-DLH-02',name:'Persian'},
            {productid:'AV-CB-01',name:'Amazon Parrot'}
        ];
        function productFormatter(value) {
            for (var i = 0; i < products.length; i++) {
                if (products[i].productid == value) return products[i].name;
            }
            return value;
        }
        $(function() {
            var lastIndex;
            $('#tt').datagrid({
                toolbar:[
                    {
                        text:'append',
                        iconCls:'icon-add',
                        handler:function() {
                            $('#tt').datagrid('endEdit', lastIndex);
                            $('#tt').datagrid('appendRow', {
                                itemid:'',
                                productid:'',
                                listprice:'',
                                unitprice:'',
                                attr1:'',
                                status:'P'
                            });
                            var lastIndex = $('#tt').datagrid('getRows').length - 1;
                            $('#tt').datagrid('beginEdit', lastIndex);
                        }
                    },
                    '-',
                    {
                        text:'delete',
                        iconCls:'icon-remove',
                        handler:function() {
                            var row = $('#tt').datagrid('getSelected');
                            if (row) {
                                var index = $('#tt').datagrid('getRowIndex', row);
                                $('#tt').datagrid('deleteRow', index);
                            }
                        }
                    },
                    '-',
                    {
                        text:'accept',
                        iconCls:'icon-save',
                        handler:function() {
                            $('#tt').datagrid('acceptChanges');
                        }
                    },
                    '-',
                    {
                        text:'reject',
                        iconCls:'icon-undo',
                        handler:function() {
                            $('#tt').datagrid('rejectChanges');
                        }
                    },
                    '-',
                    {
                        text:'getChanges',
                        iconCls:'icon-search',
                        handler:function() {
                            var rows = $('#tt').datagrid('getChanges');
                            alert('changed rows: ' + rows.length + ' lines');
                        }
                    }
                ],
                onBeforeLoad:function() {
                    $(this).datagrid('rejectChanges');
                },
                onClickRow:function(rowIndex) {
                    if (lastIndex != rowIndex) {
                        $('#tt').datagrid('endEdit', lastIndex);
                        $('#tt').datagrid('beginEdit', rowIndex);
                    }
                    lastIndex = rowIndex;
                }
            });
        });
    </script>
</head>
<body class="easyui-layout">
<jsp:include page="/common/header_menu.jsp"/>
<jsp:include page="/common/left_menu.jsp"/></div>
<div region="center" title="用户管理">
    <h1>DataGrid</h1>
    <table id="test" style="width:650px;height:auto" title="Editable DataGrid" iconCls="icon-edit" singleSelect="true"
           idField="itemid" url="datagrid_data2.json">
        <thead>
        <tr>
            <th field="itemid" width="80">Item ID</th>
            <th field="productid" width="100" formatter="productFormatter"
                editor="{type:'combobox',options:{valueField:'productid',textField:'name',data:products,required:true}}">
                Product
            </th>
            <th field="listprice" width="80" align="right" editor="{type:'numberbox',options:{precision:1}}">List
                Price
            </th>
            <th field="unitcost" width="80" align="right" editor="numberbox">Unit Cost</th>
            <th field="attr1" width="150" editor="text">Attribute</th>
            <th field="status" width="60" align="center" editor="{type:'checkbox',options:{on:'P',off:''}}">Status</th>
        </tr>
        </thead>
    </table>
</div>
<jsp:include page="/common/bottom_menu.jsp"/>
</body>
</html>