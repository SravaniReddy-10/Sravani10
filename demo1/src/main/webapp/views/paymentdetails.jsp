<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "com.example.demo.entity.Bill" %>
     <%@ page import = "com.example.demo.entity.Offer" %>
    <%@ page import = "java.util.List "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

       
<% Offer o = (Offer) request.getAttribute("plandata");%>   
 <% Long phoneNumber = (Long) request.getAttribute("phonenumber");%>
  
   <%="Bill for recharge on mobileNumber:" +phoneNumber %><br></br>
   
   
           <% out.print("offerID:" +o.getPlanId()); %><br></br>
  
  
             <% out.print("valid for:" +o.getDays()); %><br></br>
  
                <% out.print("TalkTime Amount:" +o.getTalkTime()); %><br></br>
           
                <% out.print("Data Balance:" +o.getData()); %><br></br>
          
                <% out.print("Amount payable:" +o.getPrice()); %>
                
                
            
   

</body>
</html>