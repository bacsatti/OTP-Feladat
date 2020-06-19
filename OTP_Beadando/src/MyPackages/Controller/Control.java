/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackages.Controller;

import MyPackages.Modul.Book;
import MyPackages.Modul.User;
import java.util.ArrayList;

public class Control {
    
    static ArrayList<Book> books;

    public Control() {
        this.books = new ArrayList<Book>();
    }
    
    private static void fillBooks(){
        books.add(new Book("Menetben - Túl a nyolcadik ikszen", "History", "Lőrincz Kálmán", "9789633275740", 4600));
        books.add(new Book("Star Wars: Vader - Sötét látomások", "Comics", "Dennis Hopeless Hallum", "9789634975809", 4990));
        books.add(new Book("Erjesztett Élet Éltető Étkeink", "Cooking", "Dr. Csicsor János", "9786150082882", 2500));
        books.add(new Book("Kevin Horrornaplója", "Horror", "Kevin Lyon", "9786158025461", 2990));
        books.add(new Book("The Lord of the Rings I-III", "Fantasy", "J. R. R. Tolkien", "9789634058397", 12999));
    }
    
    private static void listBooks(){
        for (int i = 0; i < books.size(); i++){
            System.out.println(books.get(i));
        }
    }
    
    private static void tesztUserAti(){
        User ati = new User("Bacskai Attila", "1999.05.22", "2200 Monor, Hunyadi János utca 22", "kisati378@gmail.com", "asd123");
        System.out.println("Registered user:\n" + ati.toString());
        ati.addToCart(books.get(4));
        ati.pay();
    }
    
    private static void tesztUserTeszt(){
        User teszt = new User("Teszt Elek", "1999.05.23", "2200 Monor, Hunyadi János utca 23", "teszt.elek@gmail.com", "asd123");
        System.out.println("Registered user:\n" + teszt.toString());
        teszt.addToCart(books.get(4));
        teszt.addToCart(books.get(1));
        teszt.pay();
        teszt.removeFromCart(books.get(4));
        teszt.addToCart(books.get(0));
        teszt.addToCart(books.get(3));
        teszt.pay();
    }
    
    public static void controller(){
        
        fillBooks();
        System.out.println();
        listBooks();
        System.out.println();
        tesztUserAti();
        System.out.println();
        tesztUserTeszt();
        
    }
}
