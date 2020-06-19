/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackages.Modul;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User implements IManageCart{
    
    private String name;
    private Date birthDate;
    private String address;
    private String email;
    private String password;
    private int balance;
    private Cart myCart;

    public User(String name, String birthDate, String address, String email, String password) {
        try{
            this.name = name;
            this.birthDate = new SimpleDateFormat("yyyy.MM.dd").parse(birthDate);
            this.address = address;
            this.email = email;
            this.password = password;
            this.balance = 15000;
            this.myCart = new Cart();
        }catch(ParseException E){}
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    
    public void pay(){
        if(this.getBalance() >= myCart.getCartPrice()){
             this.setBalance(this.getBalance()-myCart.getCartPrice());
             System.out.println("Purchase was succesful. Your remaining balance: " + this.getBalance());
        } else{
            System.out.println("Purchase has failed due to not enough balance. Remove some of the items or upload money on your account.");
        }
    }
    
    public void addToCart(Book book) {
        myCart.addToCart(book);
        System.out.println(book.toString() + " has been added to your cart. Your cart contents: ");
        myCart.displayCart();
    }
    
    public void removeFromCart(Book book) {
        myCart.removeFromCart(book);
        System.out.println(book.toString() + " has been removed from your cart. Your cart contents: ");
        myCart.displayCart();
    }
    
    @Override
    public String toString() {
        return "Name = " + name + "\n" + "birthDate = " + new SimpleDateFormat("yyyy.MM.dd").format(birthDate) + "\n" + "address = " + address + "\n" + "email = " + email;
    }
}
