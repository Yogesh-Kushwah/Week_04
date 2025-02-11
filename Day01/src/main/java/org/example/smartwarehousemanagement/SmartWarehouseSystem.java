package org.example.smartwarehousemanagement;

import java.util.ArrayList;
import java.util.List;

// Abstract base class for warehouse items
abstract class WareHouseItem {
    String itemName;

    public WareHouseItem(String itemName) {
        this.itemName = itemName;
    }

    // Abstract method to display item details
    public abstract void display();
}

// Class for electronic items
class Electronics extends WareHouseItem {
    String electronicItemName;
    double electronicItemPrice;

    public Electronics(String itemName, String electronicItemName, double electronicItemPrice) {
        super(itemName);
        this.electronicItemName = electronicItemName;
        this.electronicItemPrice = electronicItemPrice;
    }

    @Override
    public void display() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Electronic Item Name: " + electronicItemName);
        System.out.println("Electronic Item Price: " + electronicItemPrice);
    }
}

// Class for grocery items
class Groceries extends WareHouseItem {
    String groceryName;
    double groceryPrice;

    public Groceries(String itemName, String groceryName, double groceryPrice) {
        super(itemName);
        this.groceryName = groceryName;
        this.groceryPrice = groceryPrice;
    }

    @Override
    public void display() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Grocery Item Name: " + groceryName);
        System.out.println("Grocery Item Price: " + groceryPrice);
    }
}

// Class for furniture items
class Furniture extends WareHouseItem {
    String furnitureItemName;
    double furniturePrice;

    public Furniture(String itemName, String furnitureItemName, double furniturePrice) {
        super(itemName);
        this.furnitureItemName = furnitureItemName;
        this.furniturePrice = furniturePrice;
    }

    @Override
    public void display() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Furniture Item Name: " + furnitureItemName);
        System.out.println("Furniture Item Price: " + furniturePrice);
    }
}

// Generic storage class for managing warehouse items
class Storage<T extends WareHouseItem> {
    List<T> items = new ArrayList<>();

    // Add an item to the storage
    void addItems(T item) {
        items.add(item);
    }

    // Retrieve all items from the storage
    List<T> getAllItems() {
        return items;
    }

    // Display details of all items in the storage
    public void displayAll(List<? extends WareHouseItem> itemsList) {
        for (WareHouseItem item : itemsList) {
            item.display();
        }
    }
}

public class SmartWarehouseSystem {
    public static void main(String[] args) {
        // Creating storages for different types of items
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Adding items to their respective storages
        electronicsStorage.addItems(new Electronics("Electronic", "Cooler", 6000.90));
        groceriesStorage.addItems(new Groceries("Vegetables", "Lady Finger", 25.30));
        furnitureStorage.addItems(new Furniture("Red Sand Wood", "Almira", 800000.90));

        // Displaying all electronics
        electronicsStorage.displayAll(electronicsStorage.getAllItems());
        System.out.println("---------------------------------------------");

        // Displaying all groceries
        groceriesStorage.displayAll(groceriesStorage.getAllItems());
        System.out.println("---------------------------------------------");

        // Displaying all furniture
        furnitureStorage.displayAll(furnitureStorage.getAllItems());
        System.out.println("---------------------------------------------");
    }
}
