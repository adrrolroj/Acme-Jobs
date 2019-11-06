
package acme.features.administrator.display;

import org.springframework.beans.factory.annotation.Autowired;

import acme.entities.display.Display;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractShowService;

public class AdministratorDisplayShowService implements AbstractShowService<Administrator, Display> {

	//Internal State -----------------------------
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
	public Display findOne(final Request<Display> request) {
		assert request != null;

		Display result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;
	}

}
