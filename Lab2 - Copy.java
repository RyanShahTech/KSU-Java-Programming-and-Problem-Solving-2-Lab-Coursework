/*
Class: CSE 1322L
Section: J03
Term: Fall 2021
Instructor: Yamini Hanisha Talluri
Name: Ryan Shah
Lab#: Lab 2
*/

import java.util.Scanner;

class StockItem {

    private String description;
    private static int itemnumber=0;
    private int id;
    private double price;
    private int quantity;

    public StockItem() {

    }

    public StockItem(String desc,double price,int quantity)
    {
        this.id=itemnumber++;
        this.description =desc;
        this.price=price;
        this.quantity=quantity;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0)
            System.out.println("Price cannot be less than 0");
        else
            this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void LowerQuantity(int quantity) {
        if(quantity<0)
            System.out.println("Quantity cannot be less than 0");
        else
            this.quantity -= quantity;
    }

    public void RaiseQuantity(int quantity) {
        this.quantity += quantity;
    }

    public String toString() {
        return "Item number: " +id+" is "+ description + " has price " + price + " we currently have " + quantity + " in stock";
    }

}


class StockItemDriver {

    public static void main(String[] args) {

        StockItem milk=new StockItem( "1 Gallon of Milk",3.60,15);
        StockItem bread=new StockItem( "1 Loaf of Bread",1.98,30);
        Scanner input=new Scanner(System.in);
        int option=0;

        while(option!=8)
        {

            System.out.println("1. Sold One Milk");
            System.out.println("2. Sold One Bread");
            System.out.println("3. Change price of Milk");
            System.out.println("4. Change price of Bread");
            System.out.println("5. Add milk to inventory");
            System.out.println("6. Add Bread to Inventory");
            System.out.println("7. See Inventory");
            System.out.println("8. Quit");
            option=input.nextInt();

            if(option==1)
            {
                milk.LowerQuantity(1);
                continue;
            }

            else if(option==2)
            {
                bread.LowerQuantity(1);
                continue;
            }

            else if(option==3)
            {
                System.out.println("What is the new price for Milk ");
                float new_price=input.nextFloat();
                milk.setPrice(new_price);
                continue;
            }

            else if(option==4)
            {
                System.out.println("What is the new price for Bread ");
                float new_price=input.nextFloat();
                bread.setPrice(new_price);
                continue;
            }

            else if(option==5)
            {
                System.out.println("How many milk did we get? ");
                int new_quantity=input.nextInt();
                milk.RaiseQuantity(new_quantity);
                continue;
            }

            else if(option==6)
            {
                System.out.println("How many bread did we get? ");
                int new_quantity=input.nextInt();
                bread.RaiseQuantity(new_quantity);
                continue;
            }

            else if(option==7)
            {
                System.out.println("Milk: "+ milk.toString());
                System.out.println("Bread: "+ bread.toString());
                continue;
            }

            else if(option==8)
                break;
        }


    }
}