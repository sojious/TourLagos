package com.example.tourlagos;

public class ParkInfo {
    private String itemName;
    private String itemDescription;
    private String itemLocation;
    private String itemContact;

    public ParkInfo(String itemName, String itemDescription, String itemLocation, String itemContact) {
        this.itemName = itemName;
        this.itemDescription=itemDescription;
        this.itemLocation=itemLocation;
        this.itemContact=itemContact;
    }


    public String getItemContact() {
        return itemContact;
    }

    public String getItemLocation() {
        return itemLocation;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemName() {
        return itemName;
    }
}
