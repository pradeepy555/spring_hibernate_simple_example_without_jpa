<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  
"http://www.w3.org/TR/html4/loose.dtd">  
<html   ng-app="myApp">  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title><tiles:insertAttribute name="title" ignore="true" /></title>  

<script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="resources/js/angular.min.js"></script>

<script type="text/javascript" src="resources/js/app.js"></script>
<script type="text/javascript" src="resources/js/controller.js"></script>
</head>  
<body ng-controller="mycontroller">  
        <div><tiles:insertAttribute name="header" /></div>  
        
        <div style="float:left;padding:10px;width:15%;">
        <tiles:insertAttribute name="menu" />
        </div>  
        
        <div style="float:left;padding:10px;width:80%;border-left:1px solid pink;">  
        <tiles:insertAttribute name="body" />
        </div>  
        
        <div style="clear:both">
        <tiles:insertAttribute name="footer" />
        </div>  
  
</body>  
</html>  