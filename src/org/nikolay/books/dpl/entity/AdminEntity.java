package org.nikolay.books.dpl.entity;

import org.nikolay.books.api.dpl.entity.Admin;
import org.nikolay.books.api.dpl.entity.User;

public class AdminEntity implements Admin {

	private Long id;
	private User user;
	private String role;

	/**
	 * 
	 */
	public AdminEntity() {
	}

	/**
	 * @param id
	 * @param user
	 * @param role
	 */
	public AdminEntity(Long id, User user, String role) {
		this.id = id;
		this.user = user;
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