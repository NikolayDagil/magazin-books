package org.nikolay.books.dpl.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.nikolay.books.api.dpl.entity.Customer;
import org.nikolay.books.api.dpl.entity.User;

@Entity
@Table(name = "customer")
public class CustomerEntity implements Customer, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "id", unique = true, nullable = false)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "user", targetEntity = UserEntity.class, cascade = CascadeType.ALL)
	private User user;

	@Column(name = "title", nullable = true)
	private String address;

	@Column(name = "title", nullable = true)
	private String country;

	@Column(name = "title", nullable = true)
	private String city;

	@Column(name = "title", nullable = true)
	private Integer postcode;

	@Column(name = "title", nullable = true)
	private Integer rating;

	@Column(name = "title", nullable = true)
	private Integer balance;

	@Column(name = "title", nullable = true)
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
	public CustomerEntity(Long id, User user, String address, String country,
			String city, Integer postcode, Integer rating, Integer balance,
			Integer discounts) {
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