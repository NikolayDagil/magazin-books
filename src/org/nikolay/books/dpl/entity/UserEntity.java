package org.nikolay.books.dpl.entity;

import java.util.Date;

import org.nikolay.books.api.dpl.entity.User;

public class UserEntity implements User {

	private Long id;
	private String firstName;
	private String lastName;
	private String username;
	private String email;
	private Long mobile;
	private Boolean isActive;
	private Date createDate;

	/**
	 * 
	 */
	public UserEntity() {
	}

	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param username
	 * @param email
	 * @param mobile
	 * @param isActive
	 * @param createDate
	 */
	public UserEntity(Long id, String firstName, String lastName,
			String username, String email, Long mobile, Boolean isActive,
			Date createDate) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.email = email;
		this.mobile = mobile;
		this.isActive = isActive;
		this.createDate = createDate;
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
	 * @return the firstName
	 */
	@Override
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	@Override
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the username
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	@Override
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the email
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobile
	 */
	@Override
	public Long getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	@Override
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the isActive
	 */
	@Override
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive
	 *            the isActive to set
	 */
	@Override
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the createDate
	 */
	@Override
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate
	 *            the createDate to set
	 */
	@Override
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}