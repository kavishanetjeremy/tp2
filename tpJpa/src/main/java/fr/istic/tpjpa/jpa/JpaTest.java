package fr.istic.tpjpa.jpa;

import java.util.ArrayList;
import java.util.List;

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

			
	    /*Person p = new Person("Ganesh", "kavi", "homme", "inexistant", "15 sept 1991");
	    Person p2 = new Person("lecoq", "xaier", "homme", "inexistant", "15 sept 1990");
	    Person p3 = new Person("creach", "alex", "homme", "inexistant", "15 sept 1990");
	    Person p4 = new Person("moi", "jeremy", "homme", "inexistant", "15 sept 1992");
	    Person p5 = new Person("berejale", "salim", "homme", "inexistant", "15 sept 1990");
		Home h = new Home("2, rue de la larvolière", "10255", "145-256-452", p);
		Home h1 = new Home("3, rue de la larvolière", "102565", "1dg45-2dg56-45fh2", p);
		Home h2 = new Home("4, rue de la larvolière", "456", "14gj5-2dg56-45fg2", p);
		Home h3 = new Home("5, rue de la larvolière", "456", "14-25dg6-4g52", p);
		Home h4 = new Home("6, rue de la larvolière", "546546", "14dg5-2dg56-45dg2", p);
		
		List<Home> maisons = new ArrayList<Home>();
		List<Person> amis = new ArrayList<Person>();
		maisons.add(h); maisons.add(h1); maisons.add(h2); maisons.add(h3);
		amis.add(p3); amis.add(p2); amis.add(p4);	
		
		p.setAmis(amis);
		p.setMaisons(maisons);
		h.setPers(p);
		
		test.manager.persist(p);
		test.manager.persist(h);*/

		tx.commit();

		// TODO run request

		System.out.println(".. done");
	}

}
