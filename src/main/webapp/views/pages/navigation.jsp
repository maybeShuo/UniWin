<%--
  Created by IntelliJ IDEA.
  User: I330045
  Date: 6/24/2016
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<ul id="accordion" class="accordion">

    <li id="nav-material">
        <div class="link"><i class="glyphicon glyphicon-th"></i>物料管理<i class="glyphicon glyphicon-chevron-down"></i></div>
        <ul class="submenu">
            <li id="nav-material-add"><a href="<%=request.getContextPath() %>/v1/materials/materialadd">物料新增</a></li>
            <li id="nav-material-query"><a href="<%=request.getContextPath() %>/v1/materials/materialquery">物料查询</a></li>
            <li id="nav-material-supplier"><a href="<%=request.getContextPath() %>/v1/materials/materialsupplier">供应商管理</a></li>
        </ul>
    </li>

    <li id="nav-repertory">
        <div class="link"><i class="glyphicon glyphicon-th"></i>库存管理<i class="glyphicon glyphicon-chevron-down"></i></div>
        <ul class="submenu">
            <li id="nav-repertory-records"><a href="<%=request.getContextPath() %>/main/repertoryrecords">库存</a></li>
            <li id="nav-repertory-control-records"><a href="<%=request.getContextPath() %>/main/repertorycontrolrecords">库存调度</a></li>
        </ul>
    </li>

    <li id="nav-customer">
        <div class="link"><i class="glyphicon glyphicon-th"></i>客户管理<i class="glyphicon glyphicon-chevron-down"></i></div>
        <ul class="submenu">
            <li id="nav-customer-manage"><a href="<%=request.getContextPath() %>/main/customermanage">客户管理</a></li>
        </ul>
    </li>

    <li id="nav-system">
        <div class="link"><i class="glyphicon glyphicon-th"></i>系统管理<i class="glyphicon glyphicon-chevron-down"></i></div>
        <ul class="submenu">
            <li id="nav-system-user"><a href="<%=request.getContextPath() %>/main/usermanage">用户管理</a></li>
            <li id="nav-system-department"><a href="<%=request.getContextPath() %>/main/departmentmanage">组织管理</a></li>
            <li><a href="">权限分配</a></li>
            <li><a href="">角色管理</a></li>
        </ul>
    </li>

    <li id="nav-design">
        <div class="link"><i class="glyphicon glyphicon-th"></i>款式管理<i class="glyphicon glyphicon-chevron-down"></i></div>
        <ul class="submenu">
            <li id="nav-design-add"><a href="<%=request.getContextPath() %>/v1/styles/designadd">款式新增</a></li>
            <li id="nav-design-list"><a href="<%=request.getContextPath() %>/v1/styles/designlist">款式列表</a></li>
        </ul>
    </li>

    <li id="nav-inquiry">
        <div class="link"><i class="glyphicon glyphicon-th"></i>询价管理<i class="glyphicon glyphicon-chevron-down"></i></div>
        <ul class="submenu">
            <li id="nav-inquiry-manage"><a href="<%=request.getContextPath() %>/v1/inquiry/inquirymanage">询价单管理</a></li>
        </ul>
    </li>

    <li id="nav-order">
        <div class="link"><i class="glyphicon glyphicon-th"></i>订单管理<i class="glyphicon glyphicon-chevron-down"></i></div>
        <ul class="submenu">
            <li id="nav-order-list"><a href="<%=request.getContextPath() %>/v1/inquiry/inquirymanage">订单列表</a></li>
            <li id="nav-order-add"><a href="<%=request.getContextPath() %>/v1/order/orderadd">新建订单</a></li>
        </ul>
    </li>

    <li>
        <div class="link"><i class="glyphicon glyphicon-th"></i>生产管理<i class="glyphicon glyphicon-chevron-down"></i></div>
        <ul class="submenu">
            <li><a href="">生产单管理</a></li>
            <li><a href="">生产单审核</a></li>
        </ul>
    </li>

    <li>
        <div class="link"><i class="glyphicon glyphicon-th"></i>采购管理<i class="glyphicon glyphicon-chevron-down"></i></div>
        <ul class="submenu">
            <li><a href="">采购单管理</a></li>
            <li><a href="">采购单审核</a></li>
        </ul>
    </li>

    <li>
        <div class="link"><i class="glyphicon glyphicon-th"></i>制版管理<i class="glyphicon glyphicon-chevron-down"></i></div>
        <ul class="submenu">
            <li><a href="">制版单管理</a></li>
            <li><a href="">制版单修改</a></li>
            <li><a href="">样衣管理</a></li>
            <li><a href="">样衣入库</a></li>
        </ul>
    </li>



    <li>
        <div class="link"><i class="glyphicon glyphicon-th"></i>加工管理<i class="glyphicon glyphicon-chevron-down"></i></div>
        <ul class="submenu">
            <li><a href="">加工方管理</a></li>
            <li><a href="">新增外发单</a></li>
            <li><a href="">外发单管理</a></li>
            <li><a href="">收货单管理</a></li>
        </ul>
    </li>

    <li>
        <div class="link"><i class="glyphicon glyphicon-th"></i>质检管理<i class="glyphicon glyphicon-chevron-down"></i></div>
        <ul class="submenu">
            <li><a href="">质检单管理</a></li>
            <li><a href="">新增质检单</a></li>
        </ul>
    </li>

    <li>
        <div class="link"><i class="glyphicon glyphicon-th"></i>成衣管理<i class="glyphicon glyphicon-chevron-down"></i></div>
        <ul class="submenu">
            <li><a href="">成衣单管理</a></li>
            <li><a href="">成衣入库</a></li>
            <li><a href="">成衣查询</a></li>
        </ul>
    </li>

</ul>
