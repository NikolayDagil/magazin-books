package org.nikolay.books.test.dpl.entity;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.nikolay.books.api.dpl.entity.Book;
import org.nikolay.books.dpl.entity.BookEntity;
import org.nikolay.books.test.dpl.util.HibernateUtil;

public class TestEntity {

	private static final String TEST_STR = "Test";

	public static void main(String[] args) {

		Book book = new BookEntity();

		book.setTitle(TEST_STR);
		book.setAuthor(TEST_STR);

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

}