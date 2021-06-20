package com.angel.models.helpers;

import java.util.ArrayList;

public class Item extends ArrayList<Item> {
    String item_name;
    ArrayList<ItemDetails> itemDetails;

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public void setItemDetails(ArrayList<ItemDetails> itemDetails) {
        this.itemDetails = itemDetails;
    }

    public String getItem_name() {
        return item_name;
    }

    public ArrayList<ItemDetails> getItemDetails() {
        return itemDetails;
    }
}
