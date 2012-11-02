package org.nikolay.books.dpl.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.nikolay.books.api.dpl.entity.Book;
import org.nikolay.books.api.dpl.entity.Customer;
import org.nikolay.books.api.dpl.entity.Transaction;

@Entity
@Table(name = "admin")
public class TransactionEntity implements Transaction, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@OneToOne(mappedBy = "book", targetEntity = BookEntity.class, cascade = CascadeType.ALL)
	private Book book;

	@OneToOne(mappedBy = "customer", targetEntity = CustomerEntity.class, cascade = CascadeType.ALL)
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