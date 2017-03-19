<%@page import="com.triangle.MiscUtils"%>
<%@page import="com.triangle.Triangle"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Triangle Anaylsys</title>

<script type="text/JavaScript">
function validateInputs()
{
   var s1 = document.triangle.Side1.value;
   var s2 = document.triangle.Side2.value;
   var s3 = document.triangle.Side3.value;
   
   if (!isNumberOrDot("Side 1", s1) || !isNumberOrDot("Side 2", s2) || !isNumberOrDot("Side 3", s3))
      return false;
   return true;
}

function isNumberOrDot(inputName, chars) {
   
   var dotCount = 0;
   for (var i = 0; i < chars.length; i++){
      if ( !((chars[i] >= '0' && chars[i] <= '9' )
               || chars[i] == '.')) {
         alert (inputName + " has an invalid input.  Only Numbers (0-9) and only one period ('.') are allowed.");
         return false;
      }
      else if(chars[i] == '.') {
         dotCount ++;
         if (dotCount > 1) {
            alert (inputName + " has an invalid input.  Only Numbers (0-9) and only one period ('.') are allowed.");
            return false;            
         }
      }
   }
   return true;
}
</script>
</head>

<%

   String results = "";
   String side1 = "0";
   String side2 = "0";
   String side3 = "0";
   
   // My Test
   //String fullResults = "";
   try {


      if (request.getParameter("Side1") != null 
               && request.getParameter("Side2") != null 
               && request.getParameter("Side3") != null)
      {
         side1 = MiscUtils.getNotNullString(request.getParameter("Side1"));
         side2 = MiscUtils.getNotNullString(request.getParameter("Side2"));
         side3 = MiscUtils.getNotNullString(request.getParameter("Side3"));
         Triangle t = new Triangle(side1, side2, side3);
         results = t.getTriangleClassification();   
         //fullResults = t.toString();
      }
   } catch (Exception e) {
      results = Triangle.NOT_A_TRIANGLE;
   }
%>


<body>

<form name="triangle" action="index.jsp" method="POST">

<h2>Triangle Analysis</h2>

Please enter the three sides of the triangle:
<br>
<br>
<table border="0">
<tr>
<td>Side 1: </td><td><input type="text" name="Side1" value="<%=side1%>"></input></td>
</tr>
<tr>
<td>Side 2: </td><td><input type="text" name="Side2" value="<%=side2%>"></input></td>
</tr>
<tr>
<td>Side 3: </td><td><input type="text" name="Side3" value="<%=side3%>"></input></td>
</tr>
</table>
<br>

<input type="submit" name="MySubmitButton" value="Submit" onclick="return validateInputs();"></input>
<br>
<br>

<div id="Results">
<%=results %>
</div>


</form>

</body>
</html>