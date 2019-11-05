
package acme.features.authenticated.request;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.request.Request1;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedRequestListService implements AbstractListService<Authenticated, Request1> {

	//Internal State -----------------------------
	@Autowired
	AuthenticatedRequestRepository repository;


	// AbstractListService<Authenticated, Request> interface --------------------

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
	public Collection<Request1> findMany(final Request<Request1> request) {
		assert request != null;

		Collection<Request1> result;

		result = this.repository.findManyActive();

		return result;
	}

}
