
$('#btn').click(function() {
  $.ajax({
        type:'GET',
        dataType:'json',
        url:'process.do?data='+$('#data').val(),
        success:viewMessage
     });
});

function viewMessage(res){
//console.log(res);

//자식요소 삭제 
$('#wrap').empty();
// $('#wrap').children().remeve();

$('#wrap').append('<table><tr><th>employee_id</th><th>first_name</th><th>salary</th></tr></table>');
$.each(res, function(index, element){
  //$('#wrap table').append('<tr><td>'+element.employee_id+'</td><td>'+element.first_name +'</td><td>'+element.salary+'</td></tr>');
   $('#wrap table').append(`<tr><td>${element.employee_id}</td><td>${element.first_name}</td><td>${element.salary}</td></tr>`);
});





//검색후 결과창에 focus가 맞춰짐
$('#data').val('');
$('#data').focus(); //focus이벤트
}//end viewMessage()




