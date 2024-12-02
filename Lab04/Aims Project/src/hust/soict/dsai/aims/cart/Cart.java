package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;
import hust.soict.dsai.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> items = new ArrayList<Media>();

    public void addMedia(Media media){
        if(items.size() >= MAX_NUMBERS_ORDERED){
            System.out.println("The cart is full.");
        }
        else if(items.contains(media)){
            System.out.println("The media " + media.getTitle() + " is already exist in the cart!");
        }
        else {
        	System.out.println("The media " + media.getTitle() + " has been added!");
        }
    }

    public void removeMedia(Media media){
        if(items.isEmpty()) {
        	System.out.println("The cart is empty!");
        }
        else if(items.remove(media)) {
        	System.out.println("The media " + media.getTitle() + " has been removed!");
        }
        else {
        	System.out.println("The media does not exist in cart!");
        }
    }

    public float totalCost(){
        float totalcost = 0;
        for(Media media : items) {
        	totalcost += media.getCost();
        }
        return totalcost;
    }

    public void SearchId(int id){
        for(Media media : items) {
        	if(media.getID() == id) {
        		System.out.println("Found media " + media.toString());
        	}
        	return;
        }
    }
    
    public void SearchTitle(String title){
        boolean found = false;
        for(Media media : items) {
        	if(media.Match(title)) {
        		System.out.println("Found media " + media.toString());
        		found = true;
        	}
        }
	    if(!found){
	        System.out.println("The media you search is not matching!");
	    }
    }
    
    public void print() {
    	System.out.println("Items ordered: ");
    	float totalCost = 0;
    	for(int i = 0; i <= items.size(); i++) {
    		Media media = items.get(i);
    		totalCost += media.getCost();
    	}
    	System.out.println(totalCost);
    }
}

