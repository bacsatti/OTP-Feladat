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
    
    /*Azért van benne egy try-catch, hogy a dátumot átalakítsa, de ha bővíteni kellene,
    akkor egyszerű lenne kivételkezetést írni a többi adathoz is.*/
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

    //Csak a Balance-nak csináltam setter-gettert, mert csak ennek az adatait használom.
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    
    /*Tudom, hogy nem kéne kiiratásokat tennem ilyen metódusokba, de másképpen nemtudtam szemléltetni,
    hogy követhetők legyenek a történések a kimeneten.*/
    public void pay(){
        if(this.getBalance() >= myCart.getCartPrice()){
             this.setBalance(this.getBalance()-myCart.getCartPrice());
             System.out.println("\n" + "Purchase was succesful. Your remaining balance: " + this.getBalance());
        } else{
            System.out.println("\n" + "Purchase has failed due to not enough balance. Remove some of the items from your cart.");
        }
    }
    
    public void addToCart(Book book) {
        myCart.addToCart(book);
        System.out.println("\n" + book.toString() + " has been added to your cart. Your cart contents: \n");    //Ezt
        myCart.displayCart();                                                                                   //és ezt is a kimeten való követhetőség miatt tettem bele.
    }
    
    public void removeFromCart(Book book) {
        myCart.removeFromCart(book);
        System.out.println("\n" + book.toString() + " has been removed from your cart. Your cart contents: \n");    //Ezt
        myCart.displayCart();                                                                                       //és ezt is a kimeten való követhetőség miatt tettem bele.
    }
    
    @Override
    public String toString() {
        return "Name = " + name + "\n" + "birthDate = " + new SimpleDateFormat("yyyy.MM.dd").format(birthDate) + "\n" + "address = " + address + "\n" + "email = " + email;
    }
}
