<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
      <form id = "mainForm" action="${pageContext.request.contextPath}/LambdaFunction" method = "POST">
     
         Currency: <input type = "text" name = "currency" id = "currency" value="USD"/> 
         <p/>
         Product Code: <input type = "text" name = "productcode" id = "productcode" value="dsgvfb13"/>
         <p/>
         Quantity: <input type = "text" name = "quantity" id= "quantity" value="1"/>
         <p/>
         Product Total: <input type = "text" name = "producttotal" id = "producttotal" value="123.11"/>
         <p/>
         Country: <input type = "text" name = "country" id= "country" value="USA"/>
         <p/>
         City: <input type = "text" name = "city" id = "city" value="new orleans"/>
          <p/>
         State: <input type = "text" name = "state" id = "state" value="LA"/>
         <p/>
         ZipCode: <input type = "text" name = "zipcode" id = "zipcode" value="12345"/>
         <p/>
         Shipping Price: <input type = "text" name = "shippingprice" id = "shippingprice" value="10"/>
         <p/>
  
         <input type = "submit" value = "Submit"/>
      </form>
      
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
$("form").submit(function(event){
	var currency =  $('#currency').val();
	var productCode = $('#productcode').val();
	var quantity = $('#quantity').val();
	var producttotal = $('#producttotal').val();
	var country = $('#country').val();
	var city = $('#city').val();
	var state = $('#state').val();
	var zipcode = $('#zipcode').val();
	var shippingprice = $('#shippingprice').val();
	
	var formData = {"id": "3e50d4ef-ac6e-046b-b191-27244efe77e2", "country":country, "currency":currency, "productCode":productCode,
			"quantity":quantity, "productTotal":producttotal, "address":{ "country": country, "city": city, "state": state, 
				      "zipCode": zipcode }, "shippingPrice":shippingprice};
	
	var formurl = $( '#mainForm' ).attr( 'action' );
	
	$.ajax({
			    data: {productInfo : JSON.stringify(formData)},   //mydata={"name":"abc","age":"21"}
				//removed dataType = json //https://stackoverflow.com/questions/5061310/jquery-returning-parsererror-for-ajax-request
				url: formurl,
				type:'POST',
			      success: function(response)
			      {
			    	  alert("Success: " + JSON.stringify(response));
			      },
			    error : function(response) {
			    	//alert("Error: " + response.status);
			        alert("Error: "+JSON.stringify(response));
			    }
		});
	
	event.preventDefault();
});
</script>
</html>