'use strict';

var App = angular.module('myApp',['ui.router']);

App.config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider){
	
	$urlRouterProvider.otherwise("/category")
	
	$stateProvider
	.state('category', {
		url: "/category",
		templateUrl: 'category',
		controller : "CategoryController as ctgController",
		resolve: {
            async: ['ItemService', function(ItemService) {
                return ItemService.fetchCategoryList();
           	}]
        }
	})

	
	.state('category.login', {
		url: '/login',
		templateUrl: 'login'
	})
	
	
	.state('admin', {
		url: "/admin",
		templateUrl: 'admin'
		
	})
	
	
	.state('createAccount', {
		url: "/createAccount",
		templateUrl: 'createAccount'
		
	})

	

}]);

