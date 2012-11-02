package org.nikolay.books.dpl.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.nikolay.books.api.dpl.entity.Book;
import org.nikolay.books.api.dpl.entity.Customer;
import org.nikolay.books.api.dpl.entity.Transaction;

@Entity
@Table(name = "transaction")
public class TransactionEntity implements Transaction, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@ManyToOne(targetEntity = CustomerEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_fk")
	private Customer customer;

	@ManyToOne(targetEntity = BookEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "book_fk")
	private Book book;

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