
//window.onload= function(){

//}



//$(document).ready(function(){
 // $('#btn').on('click',process);
// });

$('#btn').on('click',process);
console.log('jqery');

function process(){
 $.ajax({
   type:'GET',
   dataType:'text',
   url:'ajaxview/part01/sample.txt',
   success:viewMessage
 });
}



function viewMessage(res){
   $('#wrap').html(res);
}   
