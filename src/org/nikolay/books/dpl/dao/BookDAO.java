/**
 * 
 */
package org.nikolay.books.dpl.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.nikolay.books.api.dpl.dao.IBookDAO;
import org.nikolay.books.api.dpl.entity.Book;
import org.nikolay.books.dpl.dao.util.HibernateUtil;
import org.nikolay.books.dpl.entity.SaleEntity;

/**
 * @author Nikolay Dagil
 * 
 */
public class BookDAO implements IBookDAO {

	@Override
	public void saveBook(Book book) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.save(book);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();

		}
	}

	@Override
	public void updateBook(Book book) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.update(book);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public void deleteBook(Book book) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			session.delete(book);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public Book getBookById(Long bookId) {
		Book book = null;

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();

			book = (Book) session.get(SaleEntity.class, bookId);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return book;
	}

	@Override
	public List<Book> listBook() {
		List<Book> book = null;

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();

			book = session.createQuery("FROM BookEntity").list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return book;
	}

}