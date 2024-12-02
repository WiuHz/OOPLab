package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media implements Comparable<Media>{
	
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	private static int nbMedia = 0;
	private int id;
	private String title;
	private String category;
	private float cost;
	
	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public Media(String title) {
		super();
		this.title = title;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	public int getID() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public float getCost() {
		return cost;
	}
	public boolean Match(String title) {
		return this.title.equals(title);
	}
	 public boolean equals(Object obj) {
	        if (obj == this) {
	            return true;
	        }
	        if (!(obj instanceof Media)) {
	            return false;
	        }
	        return ((Media)obj).getTitle() == this.getTitle();
	 }
	 public void play() {
		 System.out.println("Playing media!");
	 }
	 public String toString(String title, String category, float cost) {
		 return "Media: " + this.getTitle() + "Category: "  + this.getCategory() + "Cost: " + this.getCost();
	}
}
