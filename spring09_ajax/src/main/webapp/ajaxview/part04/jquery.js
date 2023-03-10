$('#btn').click(process);

function process(){
//alert('test');
$.ajax({
   type:'GET',
   dataType:'json',
   url:'searchOpen.do?query='+$('#search').val(),
   success:viewMessage,
   error:function(xhr, textStatus, error){
      alert(xhr.status);
}
});

}

function viewMessage(res){
// alert(res);
// console.log(res);
 $('#wrap').append(`<table><tr><th>title</th><th>image</th><th>price</th></tr></table>`);
 $.each(res.documents, function(index, element){
  //console.log(element);
   $('#wrap table').append(`<tr><td>${element.title}</td><td><a href="${element.url}"><img src="${element.thumbnail}"/></a></td><td>${element.price}</td></tr>`);
   
 });
 
 }