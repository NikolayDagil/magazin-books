/**
 * 
 */
package org.nikolay.books.api.dpl.dao;

import java.util.List;

import org.nikolay.books.api.dpl.entity.Operation;

/**
 * @author Nikolay Dagil
 * 
 */
public interface IOperationDAO {

	public void saveOperation(Operation operation);

	public void updateOperation(Operation operation);

	public void deleteOperation(Operation operation);

	public Operation getOperationById(Long operationId);

	public List<Operation> listTransaction();

}