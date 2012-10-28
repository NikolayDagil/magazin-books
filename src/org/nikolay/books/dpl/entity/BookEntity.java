package org.nikolay.books.dpl.entity;

import java.util.Date;

import org.nikolay.books.api.dpl.entity.Book;

public class BookEntity implements Book {

	private Long id;
	private String title;
	private String author;
	private Integer numberPage;
	private Date imprintDate;
	private Integer price;
	private Integer rating;
	private Integer discounts;
	private Boolean status;

	/**
	 * 
	 */
	public BookEntity() {
	}

	/**
	 * @param id
	 * @param title
	 * @param author
	 * @param numberPage
	 * @param imprintDate
	 * @param price
	 * @param rating
	 * @param discounts
	 * @param status
	 */
	public BookEntity(Long id, String title, String author, Integer numberPage,
			Date imprintDate, Integer price, Integer rating, Integer discounts,
			Boolean status) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.numberPage = numberPage;
		this.imprintDate = imprintDate;
		this.price = price;
		this.rating = rating;
		this.discounts = discounts;
		this.status = status;
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
	 * @return the title
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	@Override
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	@Override
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the numberPage
	 */
	@Override
	public Integer getNumberPage() {
		return numberPage;
	}

	/**
	 * @param numberPage
	 *            the numberPage to set
	 */
	@Override
	public void setNumberPage(Integer numberPage) {
		this.numberPage = numberPage;
	}

	/**
	 * @return the imprintDate
	 */
	@Override
	public Date getImprintDate() {
		return imprintDate;
	}

	/**
	 * @param imprintDate
	 *            the imprintDate to set
	 */
	@Override
	public void setImprintDate(Date imprintDate) {
		this.imprintDate = imprintDate;
	}

	/**
	 * @return the price
	 */
	@Override
	public Integer getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	@Override
	public void setPrice(Integer price) {
		this.price = price;
	}

	/**
	 * @return the rating
	 */
	@Override
	public Integer getRating() {
		return rating;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	@Override
	public void setRating(Integer rating) {
		this.rating = rating;
	}

	/**
	 * @return the discounts
	 */
	@Override
	public Integer getDiscounts() {
		return discounts;
	}

	/**
	 * @param discounts
	 *            the discounts to set
	 */
	@Override
	public void setDiscounts(Integer discounts) {
		this.discounts = discounts;
	}

	/**
	 * @return the status
	 */
	@Override
	public Boolean getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	@Override
	public void setStatus(Boolean status) {
		this.status = status;
	}

}