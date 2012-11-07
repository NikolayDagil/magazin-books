/**
 * 
 */
package org.nikolay.books.api.dpl.dao;

import java.util.List;

import org.nikolay.books.api.dpl.entity.Sale;

/**
 * @author Nikolay Dagil
 * 
 */
public interface ISaleDAO {

	public void saveSale(Sale sale);

	public void updateSale(Sale sale);

	public void deleteSale(Sale sale);

	public Sale getSaleById(Long saleId);

	public List<Sale> listSale();

}