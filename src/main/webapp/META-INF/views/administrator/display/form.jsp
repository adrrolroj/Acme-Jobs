<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="administrator.display.form.label.numberAnnouncements" path="numberAnnouncements"/>
	<acme:form-textbox code="administrator.display.form.label.numberCompanyRecords" path="numberCompanyRecords"/>
	<acme:form-textbox code="administrator.display.form.label.numberInvestorRecords" path="numberInvestorRecords"/>
	<acme:form-double code="administrator.display.form.label.minRewardsActiveRequest" path="minRewardsActiveRequest"/>
	<acme:form-double code="administrator.display.form.label.maxRewardsActiveRequest" path="maxRewardsActiveRequest"/>
	<acme:form-double code="administrator.display.form.label.averageRewardsActiveRequest" path="averageRewardsActiveRequest"/>
	<acme:form-double code="administrator.display.form.label.standardDeviationRewardsActiveRequest" path="standardDeviationRewardsActiveRequest"/>
	<acme:form-double code="administrator.display.form.label.minRewardsActiveOffers" path="minRewardsActiveOffers"/>
	<acme:form-double code="administrator.display.form.label.maxRewardsActiveOffers" path="maxRewardsActiveOffers"/>
	<acme:form-double code="administrator.display.form.label.averageRewardsActiveOffers" path="averageRewardsActiveOffers"/>
	<acme:form-double code="administrator.display.form.label.standardDeviationRewardsActiveOffers" path="standardDeviationRewardsActiveOffers"/>
	<div>
		<canvas id="canvas"></canvas>
	</div>
	<acme:form-return code="administrator.customization.form.button.return"/>
</acme:form>
