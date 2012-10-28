package org.nikolay.books.dpl.entity;

import org.nikolay.books.api.dpl.entity.Customer;
import org.nikolay.books.api.dpl.entity.User;

public class CustomerEntity implements Customer {

	private Long id;
	private User user;
	private String address;
	private String country;
	private String city;
	private Integer postcode;
	private Integer rating;
	private Integer balance;
	private Integer discounts;

	/**
	 * 
	 */
	public CustomerEntity() {
	}

	/**
	 * @param id
	 * @param user
	 * @param address
	 * @param country
	 * @param city
	 * @param postcode
	 * @param rating
	 * @param balance
	 * @param discounts
	 */
	public CustomerEntity(Long id, User user, String address,
			String country, String city, Integer postcode, Integer rating,
			Integer balance, Integer discounts) {
		this.id = id;
		this.user = user;
		this.address = address;
		this.country = country;
		this.city = city;
		this.postcode = postcode;
		this.rating = rating;
		this.balance = balance;
		this.discounts = discounts;
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
	 * @return the user
	 */
	@Override
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	@Override
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the address
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the country
	 */
	@Override
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	@Override
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the city
	 */
	@Override
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	@Override
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the postcode
	 */
	@Override
	public Integer getPostcode() {
		return postcode;
	}

	/**
	 * @param postcode
	 *            the postcode to set
	 */
	@Override
	public void setPostcode(Integer postcode) {
		this.postcode = postcode;
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
	 * @return the balance
	 */
	@Override
	public Integer getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 *            the balance to set
	 */
	@Override
	public void setBalance(Integer balance) {
		this.balance = balance;
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

}