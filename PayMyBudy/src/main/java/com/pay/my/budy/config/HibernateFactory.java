package com.pay.my.budy.config;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pay.my.budy.model.User;

public class HibernateFactory {

	public void userFactory() {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			// Create object
			User tempUser = new User("stevens", "Tavares", LocalDate.now(), "Tattoine", "jedi@star.fr", "abcd1234", "Obi-Wan", 35.5);

			// start transaction
			session.beginTransaction();

			// save the object
			session.save(tempUser);

			// commit the transaction
			session.getTransaction().commit();

		} finally {

			factory.close();
		}
	}
}
