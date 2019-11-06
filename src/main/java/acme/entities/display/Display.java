
package acme.entities.display;

import java.io.Serializable;

public class Display implements Serializable {

	private static final long	serialVersionUID	= 1L;
	//Atributes
	Integer						numberAnnouncements;
	Integer						numberCompanyRecords;
	Integer						numberInvestorRecords;
	Double						minRewardsActiveRequest;
	Double						maxRewardsActiveRequest;
	Double						averageRewardsActiveRequest;
	Double						standardDeviationRewardsActiveRequest;
	Double						minRewardsActiveOffers;
	Double						maxRewardsActiveOffers;
	Double						averageRewardsActiveOffers;
	Double						standardDeviationRewardsActiveOffers;
}
