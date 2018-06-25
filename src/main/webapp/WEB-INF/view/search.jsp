<html>
<head>
<script src="jquery-3.3.1.min.js"></script>
<script>
$(document).ready(function(){
    $("#search").click(function(){
        $.get("/api/appointment", function(data, status){
        	$("#records_table").empty();
        	$.each(data, function(i, item) {
        	        var $tr = $('<div><tr>').append(
        	            $('<td>').text(item.date),
        	            $('<td>').text(item.time),
        	            $('<td>').text(item.description)
        	        ).appendTo('#records_table');
        	});
        });
    });
    $("#add").click(function(){
    	$("#addForm").show();
    });
    $("#cancel").click(function(){
    	$("#addForm").hide();
    });
    $("#submit").click(function(){
    	var date = $('#date').val();
    	var time = $('#time').val();
    	var description = $('#description').val();
    	
    	 $.post("/api/appointment", {
    			data: JSON.stringify({
		 			"date": date,
		 			"time": time,
		 			"description": description
			    })},
			    function(data, status){
			        $("#addForm").hide();
			    });
    });
});
</script>
</head>
<body>
<h2>
	"Welcome to Appointments"
</h2>
<button id="search">Search Appointments</button>
<button id="add">Add Appointment</button>
<button id="form">Cancel</button>

<form id="addForm">
  <input type="text" id="date" placeholder="Enter Date"></input><br>
  <input type="text" id="time" placeholder="Enter Time"></input><br>
  <input type="text" id="description" placeholder="Enter Description"></input><br>
  <input type="submit" id="submit" value="Submit"></input>
</form>

<div id="records_table">Existing Appointments</div>
</body>
</html>