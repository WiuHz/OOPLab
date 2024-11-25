package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestStore{
    public static void main(String[] args){
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        store.addDVD(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        store.addDVD(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.89f);
        store.addDVD(dvd3);
        store.printStore();
        store.removeDVD(dvd2);
        store.removeDVD(dvd3);
        store.printStore();
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Frozen", "Animation", "Disney", 95, 16.0f);
        store.remove(dvd4);
        store.printStore();
    }
}