<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<t:template>
  <form:form method = "post" action = "updateAuto/${auto.id}" commandName = "auto" >
    <table>
      <tr>
        <td>
          <form:label path = "marka">marka</form:label>
        </td>
        <td>
          <form:input path="marka" value="${auto.marka}" />
        </td>
        <td>
          <from:errors cssClass="error" path="marka" ></from:errors>
        </td>
      </tr>
      <tr>
        <td>
          <form:label path = "vladelec">vladelec</form:label>
        </td>
        <td>
          <form:input path="vladelec" value ="${auto.vladelec}"/>
        </td>
        <td>
          <form:errors cssClass="error" path="vladelec"></form:errors>
        </td>
      </tr>
      <tr>
        <td>
          <form:label path = "number">number</form:label>
        </td>
        <td>
          <form:input path="number" value="${auto.number}"/>
        </td>
        <td>
          <form:errors cssClass="error" path="number"></form:errors>
        </td>
      </tr>

      <tr>
        <td colspan="2"><input type="SUBMIT" value="updateAuto"></td>
      </tr>
    </table>
  </form:form>
</t:template>
