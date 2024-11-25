package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Testing{
    public static void main(String[] args){
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("Title jungle DVD: " + jungleDVD.getTitle());
        System.out.println("Title cinderella DVD: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Title jungle DVD: " + jungleDVD.getTitle());
    }

    public static void swap(DigitalVideoDisc Obj1, DigitalVideoDisc Obj2){
        DigitalVideoDisc tmp = new DigitalVideoDisc("");
        tmp.setTitle(Obj1.getTitle());
        Obj1.setTitle(Obj2.getTitle());
        Obj2.setTitle(tmp.getTitle());
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}