package UAS;

import java.util.ArrayList;
import java.util.List;

public class InventoryItem {
    private String name;
    private String harga;
    private String merek;
    private int quantity;

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }


    public InventoryItem(String name, String harga, String merek, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.harga = harga;
        this.merek = merek;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Quantity: " + quantity + ", Merek: " + merek + ", Harga: " + harga;
    }
}


