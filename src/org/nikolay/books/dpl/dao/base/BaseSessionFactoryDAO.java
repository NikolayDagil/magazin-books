/**
 * 
 */
package org.nikolay.books.dpl.dao.base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * @author Nikolay Dagil
 * 
 */
public class BaseSessionFactoryDAO {

	private SessionFactory sessionFactory;

	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
}