package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] items = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered >= MAX_NUMBERS_ORDERED){
            System.out.println("The cart is full.");
        }
        else{
            items[qtyOrdered++] = disc;
            System.out.println("The disc has been added.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] list){
        if(qtyOrdered >= MAX_NUMBERS_ORDERED){
            System.out.println("The cart is full.");
        }
        else{
            for(int i = 0; i < list.length(); i++){
                items[qtyOrdered++] = list[i];
                System.out.println("The cart has been added.");
            }
        }
    }    

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if(qtyOrdered >= MAX_NUMBERS_ORDERED){
            System.out.println("The cart is full.");
        }
        else{
            items[qtyOrdered++] = dvd1;
            if(qtyOrdered >= MAX_NUMBERS_ORDERED){
                System.out.println("The first cart has been added. The another one is impossible because the cart is full.");
            }
            else{
                items[qtyOrdered++] = dvd2;
                System.out.println("The cart has been added.");
            }
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        for(int i = 0; i <= qtyOrdered; i++){
            if(items[i].equals(disc)){
                for(int j = 0; j <= qtyOrdered -1; j++){
                    items[j] = items[j+1];
                }
            }
            items[qtyOrdered--] = null;
            System.out.println("The disc has been removed.");
            break;
        }
    }

    public float totalCost(){
        float cost = 0;
        for(int i = 0; i < qtyOrdered; i++){
            if(items[i] != null){
                cost += items[i].getCost();
            }
        }
        return cost;
    }

    public void SearchId(int id){
        for(int i = 0; i < qtyOrdered; i++){
            if(items[i] != null && items[i].getID() == id){
                System.out.println(id);
                return;
            }
        }
    }

    public void SearchTitle(String Title){
        boolean found = false;
        for(int i = 0; i < qtyOrdered; i++){
            if(items[i] != null && items[i].Match(i)){
                System.out.println(items[i].getTitle());
            }
        }
        found = true;
    }
    if(!found){
        System.out.println("The DVD you search is not matching!");
    }
}