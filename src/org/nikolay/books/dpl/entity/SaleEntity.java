package org.nikolay.books.dpl.entity;

import org.nikolay.books.api.dpl.entity.Sale;
import org.nikolay.books.api.dpl.entity.User;

public class SaleEntity implements Sale {

	private Long id;
	private User user;
	private String address;
	private String country;
	private String city;
	private Integer postcode;
	private String role;

	/**
	 * 
	 */
	public SaleEntity() {
	}

	/**
	 * @param id
	 * @param user
	 * @param address
	 * @param country
	 * @param city
	 * @param postcode
	 * @param role
	 */
	public SaleEntity(Long id, User user, String address, String country,
			String city, Integer postcode, String role) {
		this.id = id;
		this.user = user;
		this.address = address;
		this.country = country;
		this.city = city;
		this.postcode = postcode;
		this.role = role;
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
	 * @return the role
	 */
	@Override
	public String getRole() {
		return role;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	@Override
	public void setRole(String role) {
		this.role = role;
	}

}