public class Main {
    public static void main(String[] args){
        Cart order = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        order.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        order.addDigitalVideoDisc(dvd2);
        order.removeDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.89f);
        order.addDigitalVideoDisc(dvd3);
        order.removeDigitalVideoDisc(dvd3);
        System.out.println("Total cost is: " + items.totalCost());
    }
    
}
