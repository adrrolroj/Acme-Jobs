
package acme.features.administrator.display;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.display.Display;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AdministratorDisplayRepository extends AbstractRepository {

	@Query("select a from Display a where a.id = ?1")
	Display findOneById(int id);

	@Query("select a,count(a) from Announcement")
	long countAN();
	@Query("select a,count(a) from CompanyRecords")
	long countCR();
	@Query("select a.enabled,min() from Request group by a.reward")
	Double minRE();
	@Query("select a.enabled,max() from Request group by a.reward")
	Double maxRE();
	@Query("select a.enabled,avg() from Request group by a.reward")
	Double avgRE();
	//Desviacion Request Falta

	@Query("select a.enabled,min() from Offer group by a.reward")
	Double minOF();
	@Query("select a.enabled,max() from Offer group by a.reward")
	Double maxOF();

	@Query("select a.enabled,avg() from Offer group by a.reward")
	Double avgOF();
	//Desviacion Offer Falta
}
