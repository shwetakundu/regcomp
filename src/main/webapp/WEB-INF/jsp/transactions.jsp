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
   <h1>Account Transaction Enquiry</h1>
   <table
    class="table table-striped table-hover table-condensed table-bordered">
    <tr>
     <th>Account Number</th>
     <th>Account Name</th>
     <th>Value Date</th>
     <th>Currency</th>
     <th>Debit Amount</th>
     <th>Credit Amount</th>
     <th>Debit/Credit</th>
     <th>Transaction Narrative</th>
    </tr>
    <c:forEach var="trans" items="${transactions}">
     <tr>
      <td>${trans.transactionId.accountNum}</td>
      <td>${trans.account.accountName}</td>
      <td>${trans.transactionId.valueDate}</td>
      <td>${trans.transactionId.currency}</td>
      <c:if test="${trans.transactionId.transactionType=='Debit'}">
      	<td>${trans.transactionId.amount}</td>
      	<td/>
      </c:if>
      <c:if test="${trans.transactionId.transactionType=='Credit'}">
      	<td/>
      	<td>${trans.transactionId.amount}</td>
      </c:if>
      <td>${trans.transactionId.transactionType}</td>
      <td>${trans.narrative}</td>
     </tr>
    </c:forEach>
   </table>
  </div>

 </div>

 <script type="text/javascript"
  src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

</html>