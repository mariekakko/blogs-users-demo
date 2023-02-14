// Call the dataTables jQuery plugin
$(document).ready(function() {
    loadReaders()
  $('#readers').DataTable();
});

async function loadReaders(){

  const request = await fetch('api/readers', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const readers = await request.json();

   let listHTML = '';
   for (let reader of readers){
     let deleteButton = '<a href="#" onclick="deleteReader('+reader.id+')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';

     let readerHtml = '<tr><td>'+reader.id+'</td><td>'+reader.name+'</td><td>'+deleteButton+'</td></tr>';
    listHTML += readerHtml
   }
  console.log(readers);

  document.querySelector('#readers tbody').outerHTML = listHTML;


}

async function deleteReader(id){

  if (!confirm('¿Desea eliminar este lector?')){
    return;
  }
  const request = await fetch('api/readers/' + id, {
    method: 'DELETE',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
    location.reload()
}