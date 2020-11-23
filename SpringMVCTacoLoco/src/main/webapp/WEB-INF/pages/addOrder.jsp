<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Taco Loco Order</title>
<script src="https://code.jquery.com/jquery-1.10.2.js"	type="text/javascript"></script>
</head>
<body>
<h3> Enter Order Details </h3>

<table>
		<tr>
			<td>Name</td>
			<td><input type="text" id="name"></td>
		</tr>
		<tr>
			<td>Veggie Taco</td>
			<td><input type="number" id="veggieTacoQty"></td>
		</tr>
		<tr>
			<td>Beef Taco</td>
			<td><input type="number" id="beefTacoQty"></td>
		</tr>
		<tr>
			<td>Chicken Taco</td>
			<td><input type="number" id="chickenTacoQty"></td>
		</tr>
		<tr>
			<td>Chorizo Taco</td>
			<td><input type="number" id="chorizoTacoQty"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="button" id="submit" value="Submit" /></td>
		</tr>
	</table>
	
	
	<div id="displayDiv" style="display:none"><h3>Your final order detail and cost</h3>
		<div id="processedData"></div>
	</div>
	
	
	<script>
	jQuery(document).ready(function($) {
 
		$("#submit").click(function(){
			var orderData = {};
			orderData["name"] = $("#name").val();
			orderData["veggieTacoQty"] = $("#veggieTacoQty").val();
			orderData["beefTacoQty"] = $("#beefTacoQty").val();
			orderData["chickenTacoQty"] = $("#chickenTacoQty").val();
			orderData["chorizoTacoQty"] = $("#chorizoTacoQty").val();
			
			$.ajax({
				type : "POST",
				contentType : "application/json",
				url : "postOrder",
				data : JSON.stringify(orderData),
				dataType : 'json',				
				success : function(data) {
					$('#processedData').html(JSON.stringify(data));
					$('#displayDiv').show();
					
				}
			});
		});
 
	});
</script>
</body>
</html>