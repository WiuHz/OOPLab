package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private int id;
	private String title;
	private String category;
	private float cost;
	private List<String> authors = new ArrayList<String>();
	public Book() {
		
	}
	public void addAuthor(String authorName) {
		boolean check_add = false;
		for (String au : authors) {
			if(au.equals(authorName)) {
				check_add = true;
			}
		}
		if(!check_add) {
			authors.add(authorName);
			System.out.println(authorName + " has been added!");
		}
		else {
			System.out.println("This author had been added before!");
		}
	}
	
	public void removeAuthor(String authorName) {
		boolean check_remove = false;
		for (String au: authors) {
			if(au.equals(authorName)) {
				check_remove = true;
			}
		}
		if(!check_remove) {
			authors.remove(authorName);
			System.out.println(authorName + " has been deleted!");
		}
		else {
			System.out.println("This author is not corrected!");
		}
	}
}
