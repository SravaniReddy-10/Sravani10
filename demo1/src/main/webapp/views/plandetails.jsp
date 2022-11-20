<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "com.example.demo.entity.Offer" %>
    <%@ page import = "java.util.List "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    
    
<% List<Offer> offersList = (List<Offer>) request.getAttribute("offerslists");%>   
 <% Long phoneNumber = (Long) request.getAttribute("phonenumber");%>

    
    <div class = "container">
    <table class = "table">
        <tr>
        <th></th>
        <th>Plan Id</th>
        <th>days</th>
        <th>Talktime</th>
        <th>Data</th>
        <th>Price</th>
         </tr>
  <tr>
    <% for(Offer o: offersList) { %>
        <form action = "saveDetails" method="post">
        <tr>
            <td>
            <input type="radio"  name="planId" value=<%= o.getPlanId() %>>
            </td>
            <td>
                <% out.print(o.getPlanId()); %>
            </td>
            <td>
                <% out.print(o.getDays()); %>
            </td>
            <td>
                <% out.print(o.getTalkTime()); %>
            </td>
            <td>
                <% out.print(o.getData()); %>
            </td>
            <td>
                <% out.print(o.getPrice()); %>
            </td>



       </tr>
    <% } %>    
        
    </table>
      <input type="hidden"  name="phonenumber" value=<%=phoneNumber %>>
      <input type = "submit" value="Submit">
    </form>
</body>
    
    </div>
    
    
    

     

</body>
</html>