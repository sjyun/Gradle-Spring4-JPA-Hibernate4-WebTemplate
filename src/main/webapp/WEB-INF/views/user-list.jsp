<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<body>
	<h2>User Controller</h2>

	<c:if test="${not empty users}">

		<ul>
			<c:forEach var="listValue" items="${users}">
				<li>${listValue.name}</li>
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>