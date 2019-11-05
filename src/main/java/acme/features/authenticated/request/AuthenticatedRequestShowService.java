
package acme.features.authenticated.request;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.request.Request1;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractShowService;

@Service
public class AuthenticatedRequestShowService implements AbstractShowService<Authenticated, Request1> {

	//Internal State -----------------------------
	@Autowired
	AuthenticatedRequestRepository repository;


	// AbstractShowService<Authenticated, Request1>
	@Override
	public boolean authorise(final Request<Request1> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<Request1> request, final Request1 entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "ticker", "title", "moment", "deadline", "description", "reward");
	}

	@Override
	public Request1 findOne(final Request<Request1> request) {
		assert request != null;

		Request1 result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;
	}

}
