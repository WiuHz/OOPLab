package hust.soict.dsai.aims.media;

public class Disc extends Media{
	protected String title;
	protected String category;
	private String director;
	private int length;
	protected float cost;
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	
	public Disc(String title) {
		super(title);
		this.title = title;
	}
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public Disc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public Disc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	@Override
	public int compareTo(Media o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
