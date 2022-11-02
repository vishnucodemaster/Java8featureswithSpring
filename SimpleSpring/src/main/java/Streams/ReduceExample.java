package Streams;

import java.util.*;  
class Productss{  
    int id;  
    String name;  
    float price;  
    public Productss(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class ReduceExample {  
    public static void main(String[] args) {  
        List<Productss> productsList = new ArrayList<Productss>();  
        //Adding Products  
        productsList.add(new Productss(1,"HP Laptop",25000f));  
        productsList.add(new Productss(2,"Dell Laptop",30000f));  
        productsList.add(new Productss(3,"Lenevo Laptop",28000f));  
        productsList.add(new Productss(4,"Sony Laptop",28000f));  
        productsList.add(new Productss(5,"Apple Laptop",90000f));  
        // This is more compact approach for filtering data  
        Float totalPrice = productsList.stream()  
                    .map(product->product.price)  
                    .reduce(0.0f,(sum, price)->sum+price);   // accumulating price  
        System.out.println(totalPrice);  
        // More precise code   
        float totalPrice2 = productsList.stream()  
                .map(product->product.price)  
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class  
        System.out.println(totalPrice2);  
          
    }  
}  