package org.nikolay.books.test.dpl.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new AnnotationConfiguration().configure()
					.buildSessionFactory();
		} catch (Throwable e) {
			System.err.println(e);
			throw new ExceptionInInitializerError(e);
		}
	}

	/**
	 * @return the sessionfactory
	 */
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}