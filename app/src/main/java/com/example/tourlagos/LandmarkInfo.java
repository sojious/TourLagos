package com.example.tourlagos;

public class LandmarkInfo {
    private String itemName;
    private String itemDescription;
    private String itemLocation;
    private String itemContact;
    private int itemImageId;

    public LandmarkInfo(String itemName, String itemDescription, String itemLocation,int itemImageId) {
        this.itemName = itemName;
        this.itemDescription=itemDescription;
        this.itemLocation=itemLocation;
        this.itemImageId=itemImageId;
    }

    public int getItemImageId() {
        return itemImageId;
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
