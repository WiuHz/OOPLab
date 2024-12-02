package hust.soict.dsai.aims.media;
import java.util.ArrayList;

import java.util.List;

public class CompactDisc extends Disc implements Play{
	private String artist;
	ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(String title) {
		this.title = title;
	}
	
	public CompactDisc(String artist) {
		return artist;
	}
	
	public CompactDisc(String title, String category, String artist, float cost) {
		super(title, category, cost);
		this.artist = artist;
	}
	
	public int getLength() {
		int totalLength = 0;
		for(Track track : tracks) {
			totalLength += track.getLength();
		}
		System.out.println(totalLength);
	}
	
	public void addTrack(Track track) {
		if(!tracks.contains(track)) {
			tracks.add(track);
			System.out.println("The track " + track.getTitle() + " has been added!");
		}
		else {
			System.out.println("The track " + track.getTitle() + " is already in the CD!");
		}
	}
	
	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("The track " + track.getTitle() + " has been removed!");
		}
		else {
			System.out.println("The track " + track.getTitle() + " is not already existed!");
		}
	}
	
	public void play(String title, int length) {
		System.out.println("Play DVD: " + this.getTitle());
		System.out.println("DVD Length: " + this.getLength());
	}
	
	public String toString(int ID, String title, String category, int length, float cost) {
		return this.getID() + this.getTitle() + this.getCategory() + this.getLength() + this.getCost();
	}

}
