<%@ tag description="Template Tag"  pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!doctype>

<html>
<head>
    <link href="<c:url value="/resources/c/main.css"/> " rel="stylesheet">
    <script src="<c:url value="/resources/s/autoUt.js"/> "></script>
    <title>Auto Manager</title>
</head>
<body>
<div class="content">
    <h1> Auto Manager</h1>
    <jsp:doBody/>
</div>

</body>
</html>