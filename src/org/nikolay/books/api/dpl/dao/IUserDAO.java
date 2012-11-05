/**
 * 
 */
package org.nikolay.books.api.dpl.dao;

import java.util.List;

import org.nikolay.books.api.dpl.entity.User;

/**
 * @author Nikolay Dagil
 * 
 */
public interface IUserDAO {

	public void saveUser(User user);

	public void updateUser(User user);

	public void deleteUser(User user);

	public User getUserById(Long userId);

	public List<User> listUser();

}