package org.nikolay.books.api.dpl.entity;

public interface Admin {

	/**
	 * @return the id
	 */
	public Long getId();

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id);

	/**
	 * @return the user
	 */
	public User getUser();

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user);

	/**
	 * @return the role
	 */
	public String getRole();

	/**
	 * @param role
	 *            the role to set
	 */
	public void setRole(String role);

}