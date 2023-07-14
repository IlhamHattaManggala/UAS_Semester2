package UAS;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    private List<InventoryItem> items;

    public SelectionSort() {
        items = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        items.add(item);
    }

    public void displaySelectionSort() {
        for (InventoryItem item : items) {
            System.out.println(item);
        }
    }
    public void sortByQuantity() {
        int n = items.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (items.get(j).getName().compareToIgnoreCase(items.get(minIndex).getName()) < 0) {
                    minIndex = j;
                }
            }
            InventoryItem temp = items.get(minIndex);
            items.set(minIndex, items.get(i));
            items.set(i, temp);
        }
    }
    public void sortByMerk() {
        int n = items.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (items.get(j).getMerek().compareToIgnoreCase(items.get(minIndex).getMerek()) < 0) {
                    minIndex = j;
                }
            }
            InventoryItem temp = items.get(minIndex);
            items.set(minIndex, items.get(i));
            items.set(i, temp);
        }
    }

    public void searchByName(String name) {
        List<InventoryItem> searchResults = new ArrayList<>();
        for (InventoryItem item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                searchResults.add(item);
            }
        }
        if (searchResults.isEmpty()) {
            System.out.println("No items found with the name: " + name);
        } else {
            System.out.println("Search results for name: " + name);
            for (InventoryItem item : searchResults) {
                System.out.println(item);
            }
        }
    }

    public void searchByMerk(String merek) {
        List<InventoryItem> searchResults = new ArrayList<>();
        for (InventoryItem item1 : items) {
            if (item1.getMerek().equalsIgnoreCase(merek)) {
                searchResults.add(item1);
            }
        }
        if (searchResults.isEmpty()) {
            System.out.println("No items found with the merk: " + merek);
        } else {
            System.out.println("Search results for merk: " + merek);
            for (InventoryItem item1 : searchResults) {
                System.out.println(item1);
            }
        }
    }
}
