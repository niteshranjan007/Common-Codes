<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Date Picker</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $(document).ready(function () {
	    $("#startDate").datepicker({
	        dateFormat: "dd-M-yy",
	        minDate: 0,
	        changeMonth: true,
	        changeYear: true,
	        maxDate: '+3Y',
	        onSelect: function () {
	            var endDate = $('#endDate');
	            var startDateMaxRange = $(this).datepicker('getDate');
	            startDateMaxRange.setDate(startDateMaxRange.getDate() + 365);
	            var minDate = $(this).datepicker('getDate');
	            var minDate1 = $(this).datepicker('getDate');
	            minDate1.setDate(minDate1.getDate() + 1);	   
	            endDate.datepicker('setDate', minDate);
	            endDate.datepicker('option', 'maxDate', startDateMaxRange);
	            endDate.datepicker('option', 'minDate', minDate1);
	        }
	    }).datepicker("setDate", new Date());
	    
	    $('#endDate').datepicker({
	        dateFormat: "dd-M-yy",
	        minDate: 1,
	        changeMonth: true,
	        changeYear: true,
	        maxDate: '+1Y',
	    }).datepicker("setDate", new Date());
	});
  </script>
</head>
<body>
 
<p>Start Date: <input type="text" id="startDate"></p>
<p>End Date: <input type="text" id="endDate"></p>
 
 
</body>
</html>