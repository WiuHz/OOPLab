package hust.soict.dsai.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import java.util.List;
import java.util.ArrayListed;

public class Store{
    private List<DigitalVideoDisc> items = new ArrayListed<DigitalVideoDisc>();

    public void addDVD(DigitalVideoDisc dvd){
        items.add(dvd);
        System.out.println("The dvd has been added.");
    }

    public void removeDVD(DigitalVideoDisc dvd){
        boolean delete = items.remove(dvd);
        if(deleted){
            System.out.println(dvd.getTitle() + " has been removed.");
        }
        else{
            System.out.println(dvd.getTitle() + " is not founded in items.");
        }
    }

    public void printStore(){
        for (int i : items){
            System.out.println(i+1 + ". " + items.get(i));
        }
    }
}