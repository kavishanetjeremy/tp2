package fr.istic.tpjpa.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.istic.tpjpa.domain.Home;
import fr.istic.tpjpa.domain.Person;

public class JpaTest {

	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("example");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();
		tx.begin();

		Home h = new Home("2, rue de la larvolière", "10255", "145-256-452");
	    Person p = new Person("creac'h", "alex", "homme", "inexistant", "12 janv 1990", h);
		test.manager.persist(h);
		test.manager.persist(p);

		tx.commit();

		// TODO run request

		System.out.println(".. done");
	}

}
