package UAS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SelectionSort inventory = new SelectionSort();

        // Add inventory items
        inventory.addItem(new InventoryItem("Laptop", "Rp. 2.150.000", "HP",100));
        inventory.addItem(new InventoryItem("Laptop","Rp. 3.000.000", "Axio",50));
        inventory.addItem(new InventoryItem("Laptop", "Rp. 3.700.000", "Acer",100));
        inventory.addItem(new InventoryItem("Laptop","Rp. 2.500.000", "Lenovo", 150));
        inventory.addItem(new InventoryItem("Laptop", "Rp. 4.500.000", "Asus", 150));

        System.out.println("Original Inventory:");
        inventory.displaySelectionSort();

        System.out.println("\nSorted by Name:");
        inventory.sortByQuantity();
        inventory.displaySelectionSort();

        System.out.println("\nSorted by Merk:");
        inventory.sortByMerk();
        inventory.displaySelectionSort();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the item name to search: ");
        String searchName = scanner.nextLine();
        inventory.searchByName(searchName);
        System.out.print("\nEnter the item merk to search: ");
        String searchMerk = scanner.nextLine();
        inventory.searchByMerk(searchMerk);
    }
}