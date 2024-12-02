package hust.soict.dsai.aims.store;
import java.util.List;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class Store{
    private List<Media> items = new ArrayList<Media>();

    public void addMedia(Media media){
        if(items.add(media)) {
        	System.out.println("The media " + media.getTitle() + " has been already added before!");
        }
        else {
        	items.add(media);
        	System.out.println("The media " + media.getTitle() + " has been added!");
        }
    }

    public void removeMedia(Media media){
    	boolean delete = items.remove(media);
        if(delete){
            System.out.println(media.getTitle() + " has been removed.");
        }
        else{
            System.out.println(media.getTitle() + " is not founded in items.");
        }
    }

    public void printStore(){
        for(int i = 0; i < items.size(); i++){
            System.out.println((i+1) + ". " + items.get(i));
        }
    }
    
    public Media searchTitle(String title) {
    	for (Media media : items) {
    		if(media.getTitle().equals(title));
    		return media;
    	}
    	return null;
    }
}