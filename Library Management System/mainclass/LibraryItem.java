package com.mycompany.mainclass;

public class LibraryItem {
    private String itemid;
    private String title;
    private int publicationYear;
    private int isAvailable;
    private int soldItem=0;

    public LibraryItem(String itemid, String title, int publicationYear, int isAvailable) {
        this.itemid = itemid;
        this.title = title;
        this.publicationYear = publicationYear;
        this.isAvailable = isAvailable;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(int isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getSoldItem() {
        return soldItem;
    }

    public void setSoldItem(int soldItem) {
        this.soldItem = soldItem;
    }
    
    void checkoutItem()
    {
        System.out.println("Book ID is: "+ itemid);
        System.out.println("Title of the Book is: "+ title);
        System.out.println("Publication Year of the Book is: "+ publicationYear );
        System.out.println("Available Book: "+ isAvailable);
        System.out.println("Number of sold Books are: "+ soldItem);
    }
}
