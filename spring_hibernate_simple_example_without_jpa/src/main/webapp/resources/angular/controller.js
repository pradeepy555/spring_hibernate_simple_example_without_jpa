empmodule.controller("empcontroller",function($scope, $http){
	$scope.test="This is test....fine";
	
	
	$scope.data={};
	
	$scope.save=function(){
		
		console.log($scope.data)
		
		$http({
			
			method:"POST" ,
			url:"save" ,  
			
			data: $scope.data
			}).then(function(success){} , function(error){});
	}
	
	
	
	$scope.fetch=function(){
		$http({
			
			method:"GET" ,
			url:"list"
			}).then(function(success){} , function(error){});
	}
	
	$scope.fetch();
	
	
	
	
	
});