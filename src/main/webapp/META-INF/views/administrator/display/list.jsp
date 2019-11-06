
<%--
- list.jsp
-
- Copyright (c) 2019 Rafael Corchuelo.
-
- In keeping with the traditional purpose of furthering education and research, it is
- the policy of the copyright owner to permit non-commercial use and redistribution of
- this software. It has been tested carefully, but it is not guaranteed for any particular
- purposes.  The copyright owner does not offer any warranties or representations, nor do
- they accept any liabilities with respect to them.
--%>

<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list>
	<acme:list-column code="administrator.display.list.label.numberAnnouncements" path="numberAnnouncements" width="10%"/>
	<acme:list-column code="administrator.display.list.label.numberCompanyRecords" path="numberCompanyRecords" width="10%"/>
	<acme:list-column code="administrator.display.list.label.numberInvestorRecords" path="numberInvestorRecords" width="10%"/>		
	<acme:list-column code="administrator.display.list.label.minRewardsActiveRequest" path="minRewardsActiveRequest" width="10%"/>
	<acme:list-column code="administrator.display.list.label.maxRewardsActiveRequest" path="maxRewardsActiveRequest" width="10%"/>
	<acme:list-column code="administrator.display.form.label.averageRewardsActiveRequest" path="averageRewardsActiveRequest" width="10%"/>
	<acme:list-column code="administrator.display.form.label.standardDeviationRewardsActiveRequest" path= "standardDeviationRewardsActiveRequest" width="10%"/>
	<acme:list-column code="administrator.display.form.label.minRewardsActiveOffers" path="minRewardsActiveOffers" width="10%"/>
	<acme:list-column code="administrator.display.form.label.maxRewardsActiveOffers" path="maxRewardsActiveOffers" width="10%"/>
	<acme:list-column code="administrator.display.form.label.averageRewardsActiveOffers" path="averageRewardsActiveOffers" width="10%"/>
	<acme:list-column code="administrator.display.form.label.standardDeviationRewardsActiveOffers" path="standardDeviationRewardsActiveOffers" width="10%"/>

	
</acme:list>