package id.ac.polinema.midterm;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Norton
 */
public class Item {
     protected String nama;
    protected float price;
    protected int amount;
    
    public Item(){
    }

    public Item(String nama, float price, int amount) {
        this.nama = nama;
        this.price = price;
        this.amount = amount;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
    public float getTotalPrice(){
        return price * amount;
        
    }
    //untuk mendapatkan total price dengan cara mengkalikan harga dengan jumlah 
    public String toString(){
        return nama;
    }
}
