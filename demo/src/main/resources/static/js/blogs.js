// Call the dataTables jQuery plugin
$(document).ready(function() {
    loadBlogs()
  $('#blogs').DataTable();
});

async function loadBlogs(){

  const request = await fetch('api/blogs', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const blogs = await request.json();

   let listHTML = '';
   for (let blog of blogs){
     let deleteButton = '<a href="#" onclick="deleteBlog('+blog.id+')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';

     let blogHtml = '<tr><td>'+blog.id+'</td><td>'+blog.title+'</td><td>'+blog.description+'</td><td>'+deleteButton+'</td></tr>';
    listHTML += blogHtml
   }
  console.log(blogs);

  document.querySelector('#blogs tbody').outerHTML = listHTML;


}

async function deleteBlog(id){

  if (!confirm('¿Desea eliminar este blog?')){
    return;
  }
  const request = await fetch('api/blogs/' + id, {
    method: 'DELETE',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
    location.reload()
}