<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" ng-app="empmodule">
<head>
  <title>Emp curd with spring hibernate angularjs Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
  <script src="resources/angular/module.js"></script>
   <script src="resources/angular/controller.js"></script>
</head>
<body   ng-controller="empcontroller">

<div class="container">
  <h2>Employee</h2> 
  <form ng-submit="save()">
    <div class="form-group">
      <label for="email">ID:</label>
      <input type="number" class="form-control" id="email" placeholder="Enter id" name="email" ng-model="data.id">
    </div>
    <div class="form-group">
      <label for="pwd">Name:</label>
      <input type="text" class="form-control" id="pwd" placeholder="Enter name" name="pwd" ng-model="data.name">
    </div>
    <div class="form-group">
      <label for="pwd">Salary:</label>
      <input type="number" class="form-control" id="pwd" placeholder="Enter salary" name="pwd" ng-model="data.salary">
    </div>
    <button type="submit" class="btn btn-default">Save</button>
  </form>
</div>

</body>
</html>
