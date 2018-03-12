package com.learning.spring.microservices;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOK")
public class Book {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name="BOOK_ID")
	private long bookId;
	
	@Column (name="TITLE")
	private String title;
	
	@Column (name="PAGE_COUNT")
	private int pageCount;
	
	@Column (name="AUTHOR_FIRST_NAME")
	private String authorFirstName;
	
	@Column (name="AUTHOR_LAST_NAME")
	private String authorLastName;

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthorLastName() {
		return authorLastName;
	}

	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}
}
