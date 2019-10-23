package com.tyss.tysslibrary.service;

import java.util.ArrayList;
import java.util.List;

import com.tyss.tysslibrary.dto.Books;

public interface LibrarianService {
	public boolean addBook(Books book);

	public boolean removeBook(int bId);

	public List<Books> getAllBook();

	public ArrayList<Books> searchBook(String bName);
}
