package MyPackages.Modul;

import java.util.ArrayList;

public class Cart implements IManageCart {
    
    ArrayList<Book> cart;

    public Cart() {
        cart = new ArrayList<Book>();
    }
    
    public int getCartPrice(){
        int price = 0;
        for (int i = 0; i < cart.size(); i++){
            price+= cart.get(i).getPrice();
        }
        return price;
    }
    
    public void displayCart(){
        for (int i = 0; i < cart.size(); i++){
            System.out.println(cart.get(i));
        }
    }
    
    public void addToCart(Book book){
        cart.add(book);
    }
    
    public void removeFromCart(Book book){
        cart.remove(book);
    }
}
