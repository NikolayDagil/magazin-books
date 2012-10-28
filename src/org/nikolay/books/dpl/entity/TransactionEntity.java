package org.nikolay.books.dpl.entity;

import org.nikolay.books.api.dpl.entity.Book;
import org.nikolay.books.api.dpl.entity.Customer;
import org.nikolay.books.api.dpl.entity.Transaction;

public class TransactionEntity implements Transaction {

	private Long id;
	private Book book;
	private Customer customer;

	/**
	 * 
	 */
	public TransactionEntity() {
	}

	/**
	 * @param id
	 * @param book
	 * @param customer
	 */
	public TransactionEntity(Long id, Book book, Customer customer) {
		this.id = id;
		this.book = book;
		this.customer = customer;
	}

	/**
	 * @return the id
	 */
	@Override
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the book
	 */
	@Override
	public Book getBook() {
		return book;
	}

	/**
	 * @param book
	 *            the book to set
	 */
	@Override
	public void setBook(Book book) {
		this.book = book;
	}

	/**
	 * @return the customer
	 */
	@Override
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	@Override
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}