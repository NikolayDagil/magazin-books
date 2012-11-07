/**
 * 
 */
package org.nikolay.books.api.dpl.dao;

import java.util.List;

import org.nikolay.books.api.dpl.entity.Customer;

/**
 * @author Nikolay Dagil
 * 
 */
public interface ICustomerDAO {

	public void saveCustomer(Customer customer);

	public void updateCustomer(Customer customer);

	public void deleteCustomer(Customer customer);

	public Customer getCustomerById(Long customerId);

	public List<Customer> listCustomers();

}