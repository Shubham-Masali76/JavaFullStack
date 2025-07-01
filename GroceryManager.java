/*
    Grocery management system using lambda:
    Operation to be performed:
        -store items with attributes name, price, category, quantity 
        -add items to inventory 
        -filter items by category 
        -sort items by price
        -calculate total inventory value (price*quantity)
        -display result for each
 */

import java.util.*;

class Item {
    String name;
    double price;
    String category;
    int quantity;

    public Item(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    public double totalValue() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return name + " | " + category + " | $" + price + " | Qty: " + quantity;
    }
}

public class GroceryManager {

    private final List<Item> inventory = new ArrayList<>();

    // Method to add item
    public void addItem(String name, double price, String category, int quantity) {
        inventory.add(new Item(name, price, category, quantity));
    }

    // Method to filter by category
    public void filterByCategory(String category) {
        System.out.println("\nItems in category: " + category);
        inventory.stream()
                 .filter(item -> item.category.equalsIgnoreCase(category))
                 .forEach(System.out::println);
    }

    // Method to sort by price
    public void sortByPrice() {
        System.out.println("\nSorted by Price:");
        inventory.stream()
                 .sorted(Comparator.comparingDouble(item -> item.price))
                 .forEach(System.out::println);
    }

    // Method to calculate total inventory value
    public void totalInventoryValue() {
        double totalValue = inventory.stream()
                                     .mapToDouble(Item::totalValue)
                                     .sum();
        System.out.println("\nTotal Inventory Value: $" + totalValue);
    }

    // Method to display all items
    public void displayInventory() {
        System.out.println("\nInventory:");
        inventory.forEach(System.out::println);
    }

    public static void main(String[] args) {
        GroceryManager gm = new GroceryManager();

        // Adding items
        gm.addItem("Apple", 2.5, "Fruit", 50);
        gm.addItem("Bread", 1.5, "Bakery", 20);
        gm.addItem("Milk", 3.0, "Dairy", 10);
        gm.addItem("Orange", 2.0, "Fruit", 30);

        // Display items
        gm.displayInventory();

        // Filter by category
        gm.filterByCategory("Fruit");

        // Sort by price
        gm.sortByPrice();

        // Total value
        gm.totalInventoryValue();
    }
}
