/**
 * 
 */
package org.nikolay.books.dpl.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.nikolay.books.api.dpl.dao.ISaleDAO;
import org.nikolay.books.api.dpl.entity.Sale;
import org.nikolay.books.dpl.dao.util.HibernateUtil;
import org.nikolay.books.dpl.entity.SaleEntity;

/**
 * @author Nikolay Dagil
 * 
 */
public class SaleDAO implements ISaleDAO {

	@Override
	public void saveSale(Sale sale) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.save(sale);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();

		}
	}

	@Override
	public void updateSale(Sale sale) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.update(sale);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public void deleteSale(Sale sale) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(sale);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public Sale getSaleById(Long saleId) {
		Sale sale = null;

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();

			sale = (Sale) session.get(SaleEntity.class, saleId);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return sale;
	}

	@Override
	public List<Sale> listSale() {
		List<Sale> sale = new ArrayList<>();

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();

			sale = session.createQuery("FROM SaleEntity").list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return sale;
	}

}