/**
 * 
 */
package org.nikolay.books.api.dpl.dao;

import java.util.List;

import org.nikolay.books.api.dpl.entity.Book;

/**
 * @author Nikolay Dagil
 * 
 */
public interface IBookDAO {

	public void saveBook(Book book);

	public void updateBook(Book book);

	public void deleteBook(Book book);

	public Book getBookById(Long bookId);

	public List<Book> listBook();
}