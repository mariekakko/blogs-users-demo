// Call the dataTables jQuery plugin
$(document).ready(function() {
       //on ready

});

async function registerBlogs(){

  let data = {};
  data.title = document.getElementById('txtTitle').value;
  data.description = document.getElementById('txtDesc').value;

  const request = await fetch('api/blogs', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
        body: JSON.stringify(data)
  });
  const blogs = await request.json();
}