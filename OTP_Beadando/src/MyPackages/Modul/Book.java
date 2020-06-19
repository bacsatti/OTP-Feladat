/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackages.Modul;

/**
 *
 * @author kisat
 */
public class Book {
    
    private String title;
    private Category category;
    private String author;
    private String isbn;
    private int price;

    public Book(String title, String category, String author, String isbn, int price) {
        this.title = title;
        this.category = Category.valueOf(category);
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "title = " + title + " from " + author;
    }
    
}
