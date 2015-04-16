<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>

<t:template>
  <form:form method = "post" action = "addAuto" commandName = "auto">
    <table>
      <tr>
        <td>
          <form:label path = "marka">marka</form:label>
        </td>
        <td>
          <form:input path="marka"/>
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
          <form:input path="vladelec" />
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
          <form:input path="number"/>
        </td>
        <td>
          <form:errors cssClass="error" path="number"></form:errors>
        </td>
      </tr>

      <tr>
        <td colspan="2"><input type="SUBMIT" value="addAuto"></td>
      </tr>
    </table>
  </form:form>

</t:template>