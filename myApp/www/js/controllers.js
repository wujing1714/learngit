/**
 * Created by lenovo on 2016/3/3 0003.
 */
angular.module('myMode', ['ngSanitize'],function($provide){
  $provide.provider('providerServices01',function(){
    this.$get=function(){
      return 'this is providerService'
    }
  });
  $provide.provider('providerServices02',function(){

    this.$get=function(){
      var _name='';
      var service={};
      service.setName=function(name){
        _name=name;
      }
      service.getName=function(){
        return _name;
      }
      return service;
    }
  });
})

.config(function($provide){
  $provide.factory('factoryServices01',function(){
    return 'this is factoryService'
  });
})

.service('serviceServices01',function(){
  return {
    message: 'this is serviceService'
  }
})
  .controller('secondController',['$scope','providerServices01','providerServices02','factoryServices01','serviceServices01',
    function($scope,providerServices01,providerServices02,factoryServices01,serviceServices01) {

    providerServices02.setName(providerServices01);
    $scope.name3=providerServices02.getName();
    $scope.name4=factoryServices01;
    $scope.name5=serviceServices01;
  }])
  .controller('firstController', function($scope,$timeout) {

    $scope.text='phonegap中文网';
    $scope.text2='<h2>这是h2</h2>';
    $scope.run=function(){
      alert('run');
    }
    $scope.url ="test.html"
    $scope.tpl ="tpl.html"
    $scope.names = ['pizza', 'unicorns', 'robots'];
    $scope.my = { favorite: 'unicorns' };

    $scope.cname='张三';
    $scope.cage='10';
    setTimeout(function(){
      $scope.$apply(function(){
        $scope.cname='李四';
      });
    },2000);
    $timeout(function(){
      $scope.cage='50';
    },2000);

    $scope.person=[
      {name:'张三',age:'25'},
      {name:'李四',age:'30'},
      {name:'王五',age:'36'}
    ];
    $scope.names2 = [
      {name:'Jani',country:'Norway'},
      {name:'Hege',country:'Sweden'},
      {name:'Kai',country:'Denmark'}
    ];
  })

  .directive("hello",function(){
    return{
      restrict:'E',
      template:'<div class="red">hello<strong>你好</strong>everyone</div>',
      replace:true
    }});
