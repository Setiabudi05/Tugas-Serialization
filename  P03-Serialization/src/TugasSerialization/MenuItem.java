/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasSerialization;

/**
 *
 * @author ACER
 */
public class MenuItem {

    String nama;
    double harga;

    public MenuItem(String name, double price) {
        this.nama = name;
        this.harga = price;
    }

    @Override
    public String toString() {
        return "\r\nNama=" + nama + "\r\nHarga=" + harga + "\r\n";
    }
}

