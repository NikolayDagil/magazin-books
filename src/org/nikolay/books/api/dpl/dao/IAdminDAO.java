/**
 * 
 */
package org.nikolay.books.api.dpl.dao;

import java.util.List;

import org.nikolay.books.api.dpl.entity.Admin;

/**
 * @author Nikolay Dagil
 * 
 */
public interface IAdminDAO {

	public void saveAdmin(Admin admin);

	public void updateAdmin(Admin admin);

	public void deleteAdmin(Admin admin);

	public Admin getAdminById(Long adminId);

	public List<Admin> listAdmin();

}