package hust.soict.dsai.aims.media;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	// Create attribute id and nbDigitalVideoDisc
	private static int nbDigitalVideoDisc = 0;
	private int id;
	//Update the attribute nbDigitalVideoDisc and put it to id
	public void setTitle(String Title){
		this.title = title;
	}
	public DigitalVideoDisc(int id){
		nbDigitalVideoDisc++;
		id = nbDigitalVideoDisc;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		nbDigitalVideoDisc++;
		id = nbDigitalVideoDisc;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.category = category;
		this.title = title;
		this.cost = cost;
		nbDigitalVideoDisc++;
		id = nbDigitalVideoDisc;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.director = director;
		this.category = category;
		this.title = title;
		this.cost = cost;
		nbDigitalVideoDisc++;
		id = nbDigitalVideoDisc;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDisc++;
		id = nbDigitalVideoDisc;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public int getID(){
		return id;
	}
	public boolean Match(String title){
		return this.title.equals(title);
	}
	public String toString(){
		return "DVD: " + title + " " + category + " " + director + " " + length + " " + cost;
	}
	public void play() {
		System.out.println("Playing DVD: " + title);
		System.out.println("DVD length: " + length);
	}
}