
package acme.features.authenticated.request;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.request.Request1;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuthenticatedRequestRepository extends AbstractRepository {

	@Query("select r from Request1 r where r.id = ?1")
	Request1 findOneById(int id);

	@Query("select r from Request1 r")
	Collection<Request1> findManyAll();

	@Query("select r from Request1 r where r.deadline > current_date()")
	Collection<Request1> findManyActive();
}
