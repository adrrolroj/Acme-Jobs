
package acme.features.administrator.display;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import acme.entities.display.Display;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractListService;

public class AdministratorDisplayListService implements AbstractListService<Administrator, Display> {

	@Autowired
	AdministratorDisplayRepository repository;


	@Override
	public boolean authorise(final Request<Display> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<Display> request, final Display entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "numberAnnouncements", "numberCompanyRecords", "numberInvestorRecords", "minRewardsActiveRequest", "maxRewardsActiveRequest", "averageRewardsActiveRequest", "standardDeviationRewardsActiveRequest",
			"minRewardsActiveOffers", "maxRewardsActiveOffers", "averageRewardsActiveOffers", "standardDeviationRewardsActiveOffers");

	}

	@Override
	public Collection<Display> findMany(final Request<Display> request) {
		// TODO Auto-generated method stub
		return null;
	}

	//	@Override
	//	public Long findMany(final Request<Display> request) {
	//		assert request != null;
	//		Long result;
	//		result = this.repository.countAN();
	//		return result;
	//	}

}
