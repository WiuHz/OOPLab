package hust.soict.dsai.aims.media;

public class Track {
	
	private String title;
	private int length;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	public void play() {
		System.out.println("The media " + this.getTitle());
		System.out.println("Media length: " + this.getLength());
	}
	public boolean equals(Object obj) {
        if (this == obj) {  
            return true;
        }
        if (!(obj instanceof Track)) {
            return false;
        }
        return ((Track)obj).getTitle() == this.getTitle() && ((Track)obj).getLength() == this.getLength();
    }
}
