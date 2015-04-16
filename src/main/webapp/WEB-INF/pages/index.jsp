<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:template>
  <c:if test="${!empty autos}">
    <table class="auto-list-table">
      <tr>
        <th>Marka</th>
        <th>Vladelec</th>
        <th>Number</th>
        <th>&nbsp;</th>
        <th>&nbsp;</th>
      </tr>
      <c:forEach items="${autos}" var="auto">
        <tr>
          <td>${auto.marka}</td>
          <td>${auto.vladelec}</td>
          <td>${auto.number}</td>
          <td><a href="javascript:AutoUtil.deleteAuto(${auto.id})">delete</a> </td>
          <td><a href="updateAuto/${auto.id}">update</a></td>
        </tr>
      </c:forEach>

    </table>
  </c:if>
  <a href="addAuto">addauto</a>
</t:template>
