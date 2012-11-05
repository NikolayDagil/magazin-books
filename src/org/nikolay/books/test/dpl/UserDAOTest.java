/**
 * 
 */
package org.nikolay.books.test.dpl;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.nikolay.books.api.dpl.dao.IUserDAO;
import org.nikolay.books.api.dpl.entity.User;
import org.nikolay.books.dpl.dao.UserDAO;
import org.nikolay.books.dpl.entity.UserEntity;

/**
 * @author Nikolay Dagil
 * 
 */
public class UserDAOTest {

	private static final String TEST_A_STR = "Test A";
	private static final String TEST_B_STR = "Test B";

	private static final Boolean TEST_TRUE = true;
	private static final Boolean TEST_FALSE = false;

	IUserDAO userDAO = new UserDAO();

	@Test
	public void create() {
		int rowCount = 0;
		List<User> users = null;

		users = userDAO.listUser();

		Assert.assertNotNull(users);
		rowCount = users.size();

		User user = new UserEntity();
		user.setFirstName(TEST_A_STR);
		user.setLastName(TEST_A_STR);
		user.setUsername(TEST_A_STR);
		user.setEmail(TEST_A_STR);
		user.setIsActive(TEST_TRUE);
		userDAO.saveUser(user);

		users = userDAO.listUser();

		Assert.assertNotNull(users);
		Assert.assertEquals(rowCount + 1, users.size());
	}
}