package com.example.tourlagos;

public class EventInfo {
    private String itemName;
    private String itemDescription;

    public EventInfo(String itemName,String itemDescription) {
        this.itemName = itemName;
        this.itemDescription=itemDescription;
    }


    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemName() {
        return itemName;
    }
}
