package com.mycompany.mainclass;

public class DVD extends LibraryItem{
    int duration;

    public DVD(int duration, String itemid, String title, int publicationYear, int isAvailable) {
        super(itemid, title, publicationYear, isAvailable);
        this.duration = duration;
    }
    
    double show()
    {
        return duration * 5;
    }
    @Override
    void checkoutItem()
    {
        System.out.println("Book ID is: "+ this.getItemid());
        System.out.println("Title of the Book is: "+ this.getTitle());
        System.out.println("Publication Year of the Book is: "+ this.getPublicationYear() );
        System.out.println("Available Book: "+ this.getIsAvailable());
        System.out.println("Number of sold Books are: "+ this.getSoldItem());
        System.out.println("Total Sold: "+ show());
        System.out.println("Value of Books: " + show());
    }
}
