/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasSerialization;

/**
 *
 * @author ACER
 */
import java.io.Serializable;
import java.util.List;
import serialisasi.ProductItem;

public class Menu implements Serializable {

    private String menuName;
    private transient double price; // Gunakan transient untuk mencegah serialisasi
    private static final int DEFAULT_STOCK = 100; // Static dan final tidak disertakan dalam serialisasi

    // Constructor
    public Menu(String menuName, double price) {
        this.menuName = menuName;
        this.price = price;
    }

    Menu() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getter dan setter
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String productName) {
        this.menuName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Metode lainnya
    @Override
    public String toString() {
        return "Menu{"
                + "menuName='" + menuName + '\''
                + ", price=" + price
                + '}';
    }

    void setId(String id_produk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setNama(String nama_produk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setItems(List<MenuItem> m) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
