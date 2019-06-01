<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

<link rel="stylesheet" type="text/css"
 href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>
 <div class="container">
  <div class="starter-template">
   <h1>Account List Enquiry</h1>
   <table
    class="table table-striped table-hover table-condensed table-bordered">
    <tr>
     <th>Account Number</th>
     <th>Account Name</th>
     <th>Account Type</th>
     <th>Balance Date</th>
     <th>Currency</th>
     <th>Opening Available Balance</th>
    </tr>
    <c:forEach var="account" items="${accounts}">
     <tr>
      <td><a href="${pageContext.request.contextPath}/details?accountNumber=${account.accountNumber}">${account.accountNumber}</a></td>
      <td>${account.accountName}</td>
      <td>${account.accountType}</td>
      <td>${account.balanceDate}</td>
      <td>${account.currency}</td>
      <td>${account.availableBalance}</td>
     </tr>
    </c:forEach>
   </table>
  </div>

 </div>

 <script type="text/javascript"
  src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

</html>