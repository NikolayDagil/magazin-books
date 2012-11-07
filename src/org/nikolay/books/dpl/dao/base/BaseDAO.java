/**
 * 
 */
package org.nikolay.books.dpl.dao.base;

import java.io.Serializable;
import java.util.List;

/**
 * @author Nikolay Dagil
 * 
 */

public abstract class BaseDAO<I, T extends I, PK extends Serializable> extends
		BaseSessionFactoryDAO {

	private Class<T> entityClass;

	/**
	 * @param entityClass
	 */
	public BaseDAO(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	/**
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public I get(PK id) {
		return (T) getCurrentSession().get(entityClass, id);
	}

	/**
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<I> getAll() {
		return getCurrentSession().createQuery("from " + entityClass.getName())
				.list();
	}

	/**
	 * @param newInstance
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public PK create(I newInstance) {
		return (PK) getCurrentSession().save(newInstance);
	}

	/**
	 * @param transientObject
	 */
	public void update(I transientObject) {
		getCurrentSession().update(transientObject);
	}

	/**
	 * @param persistentObject
	 */
	public void delete(I persistentObject) {
		getCurrentSession().delete(persistentObject);
	}

	/**
	 * @param id
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public boolean exists(PK id) {
		I i = (I) getCurrentSession().get(entityClass, id);
		return i != null;
	}
}