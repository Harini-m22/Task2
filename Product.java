package task2;

import java.util.Scanner;

// Creating a product class
public class Product {
    // creating variables
    int pid;
    double price;
    int quantity;

    //Creating parameterized constructor with pid,price and quantity parameters
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

}

 class XYZ{
    // calculateTotalAmount method calculates the total amount of the given product
     public double calculateTotalAmount(Product[] products) {
         double totalAmount = 0;
         for (Product product : products) {
             totalAmount += product.price * product.quantity;
         }
         return totalAmount;
     }
    public static void main(String[] args){

        // Creating a array which takes 5 product details from the user
        Product[] products = new Product[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < products.length; i++){

            System.out.println("Enter product ID "+(i+1)+ ":");
            int pid = sc.nextInt();
            double price = sc.nextInt();
            int quantity = sc.nextInt();
            products[i] =new Product(pid,price,quantity);
        }
        //Below will check for the product id with the highest price
        double highest_price=products[0].price;
        int highest_price_pid = products[0].pid;
        for(int i = 0; i < products.length; i++){
           if(products[i].price > highest_price){
               highest_price_pid = products[i].pid;
                }
        }
        System.out.println("Pid of highest priced product is: "+highest_price_pid);
        // Creating a object to get the total amount using calculateTotalAmount method
        XYZ xyz = new XYZ();
        double totalAmount = xyz.calculateTotalAmount(products);
        System.out.println("totalAmount : "+totalAmount);

    }
}


//OUTPUT
//        Enter product ID 1:
//        1
//        20
//        2
//        Enter product ID 2:
//        2
//        20
//        1
//        Enter product ID 3:
//        3
//        40
//        4
//        Enter product ID 4:
//        4
//        10
//        1
//        Enter product ID 5:
//        5
//        5
//        1
//        Pid of highest priced product is: 3
//        totalAmount : 235.0

