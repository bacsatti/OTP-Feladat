package MyPackages.Modul;

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
    
    //Itt szintén csak ennek a getter-ét csináltam meg, a többire csak akkor lenne szükségem, ha csinálok UI felületet
    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title + " from " + author; //Nem iratom ki az összes adatát, mert különben nehezebben lenne látható a kimeneten, hogy mi is történt.
    }
}
