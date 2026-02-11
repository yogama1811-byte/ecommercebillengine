package com.example.ecommercebillingengine;
import java.util.Scanner;

class Item{
    
       int id;
       String name;
       double unitedprice;
       
       Item(int id, String name, double unitedPrice){
       
       this.id=id;
       this.name=name;
       this.unitedprice=unitedPrice;
       }
    }
    
    class Bill{
       
        Item[] items;
        int[] qualities;
        
        Bill(Item[] items, int[] qualities){
          this.items=items;
          this.qualities=qualities;
        }
        
        double calculatetotal(){
         
            double total=0;
            
            for(int i=0; i< items.length; i++){
             
                total+=items[i].unitedprice*qualities[i];
            
            }
            return total;
        
        }
        void printbill(){
            System.out.printf("%-10s %-5s %-5s%n","Item","Qty","Price");
            
            System.out.println("------------------------");
            
            for(int i =0; i <items.length; i++){
                
            double price = items[i].unitedprice*qualities[i];
            
            System.out.printf("%-10s %-5s %-5s%n", items[i].name,qualities[i],price);
            }
//            System.out.println("------------");
//            System.out.printf("%-10s %-5s %-5s%n", "Total","",calculatetotal());
        }
        }
public class Ecommercebillingengine {
    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many items to purchase? ");
        
        int n = sc.nextInt();
        
        sc.nextLine();
        
        Item[] items = new Item[n];
        
        int[] qualities = new int[n];
        
        for(int i=0; i<n; i++){
        
         System.out.println("Enter item name: ");
         
         String name = sc.nextLine();
         
         System.out.println("Enter unit price: ");
         
         double price = sc.nextDouble();
         
         System.out.println("Enter Quantity: ");
         
         int qty = sc.nextInt();
         
         sc.nextLine();
         
         items[i] = new Item(i+ 1,name,price);
         qualities[i]=qty;
         
        }
        
        Bill bill = new Bill(items,qualities);
//        System.out.println("***** BILL ******");
        bill.printbill();
    }
}
