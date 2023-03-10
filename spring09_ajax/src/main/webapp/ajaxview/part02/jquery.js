
$('#btn').on('click',process);
/*
function process(){
 $.ajax({
    type:'POST',
    dataType:'text',
    data:{name:$('#name').val()},
    url:'name.do',
    success:viewMessage
    });
    }
 */   
    
  //post방법 요청할때 소문자   
function process(){
    $.post('name.do', {name:$('#name').val()}, viewMessage);
  }  
    
    
    
    function viewMessage(res){
    $('#wrap').html(res);
    
    }