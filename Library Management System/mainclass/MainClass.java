package com.mycompany.mainclass;

public class MainClass {

    public static void main(String[] args) {
        LibraryItem l1= new LibraryItem("001", "Atomic Habits", 2018, 90);
        l1.checkoutItem();
        System.out.println();
        
        Book b1= new Book(200,"002","Ikigai", 2014, 45);
        b1.checkoutItem();
        
        Journal j1= new Journal(350,"003","Looking for Alaska", 2018, 15);
        j1.checkoutItem();
        
        DVD d1= new DVD(108,"004","Zootopia", 2016, 8);
        d1.checkoutItem();
    } 
}
