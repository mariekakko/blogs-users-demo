// Call the dataTables jQuery plugin
$(document).ready(function() {
       //on ready

});

async function registerReaders(){

  let data = {};
  data.name = document.getElementById('txtName').value;

  const request = await fetch('api/readers', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
        body: JSON.stringify(data)
  });
  const readers = await request.json();
}