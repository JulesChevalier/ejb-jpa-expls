import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test_jpa");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction userTransaction = em.getTransaction();
		userTransaction.begin();
		
		User user = new User("tester", "aa");
		em.persist(user);
		
		userTransaction.commit();
		em.close();
		entityManagerFactory.close();
	}

}
