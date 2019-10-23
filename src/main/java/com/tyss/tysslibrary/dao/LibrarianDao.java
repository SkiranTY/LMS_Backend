package com.tyss.tysslibrary.dao;

import java.util.ArrayList;
import java.util.Collection;

import com.tyss.tysslibrary.dto.Books;

public interface LibrarianDao {

	public boolean addbook(Books books);
	
	public ArrayList<Books> getAllbooks();
	
	public boolean removebook(int bId);
	
	public ArrayList<Books> searchbooks(String bName);
	
}