// import products.*;

import java.io.*;

// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

// The wildcard import java.* is not valid
// Only specific packages under java.* can be imported
// The required imports are already present above:
// import java.io.*; and import java.util.ArrayList;
abstract class roll{
    int rollperson;
    
    public  roll(int rollperson){
     this.rollperson = rollperson;
    }

    public abstract String toString();

}


final class itemarray {
    String name;
    int qty;

    int price;
    String status;
    
    public itemarray(String name, int qty, int price){
        this.name = name;
        this.qty = qty;
        
        this.price = price;
        this.status = "stock";
    }
}

class customermanager extends roll{
    String productname;
    public customermanager(int rollperson,String productname){
        super(rollperson);
        this.productname = productname;
    }



    public void buyfile(productserver obj){
        
                        
        File file = new File("buyproducts.txt");
        File tempfile = new File("tempbuyproduct.txt");
    
    
        try(BufferedReader reader = new BufferedReader(new FileReader(file));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile))){
    
            
                    for(itemarray emp : obj.items){
                        if(emp.status.equalsIgnoreCase("buy")){
                            String dataline = "Product : " + emp.name + " " + "Quatity: " + emp.qty + " "+  "Price : "  + emp.price + " " + "Status :" + emp.status;
    
                            writer.write(dataline);
                            writer.newLine();
                        }
                     
                    }
    
                    
        }
    
        catch(FileNotFoundException e){
            System.out.println("File not foun:" + e.getMessage());
    
        }
    
        catch(IOException e){
            System.out.println("File could not update" + e.getMessage());
        }
    
        file.delete();
        tempfile.renameTo(file);
    }
    
    public void returnfile(productserver obj){
        
                        
        File file = new File("returnitem.txt");
        File tempfile = new File("tempreturn.txt");
    
    
        try(BufferedReader reader = new BufferedReader(new FileReader(file));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile))){
    
            
                    for(itemarray emp : obj.items){
                        if(emp.status.equalsIgnoreCase("return")){
                            String dataline = "Product : " + emp.name + " " + "Quatity: " + emp.qty + " "+  "Price : "  + emp.price + " " + "Status :" + emp.status;
    
                            writer.write(dataline);
                            writer.newLine();
                        }
                     
                    }
    
                    
        }
    
        catch(FileNotFoundException e){
            System.out.println("File not foun:" + e.getMessage());
    
        }
    
        catch(IOException e){
            System.out.println("File could not update" + e.getMessage());
        }
    
        file.delete();
        tempfile.renameTo(file);
    }



    public void stockfile(productserver obj){
        
                        
        File file = new File("stockitem.txt");
        File tempfile = new File("tempstock.txt");
    
    
        try(BufferedReader reader = new BufferedReader(new FileReader(file));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile))){
    
            
                    for(itemarray emp : obj.items){
                        if(emp.status.equalsIgnoreCase("return") || emp.status.equalsIgnoreCase("stock")){
                            String dataline = "Product : " + emp.name + " " + "Quatity: " + emp.qty + " "+  "Price : "  + emp.price + " " + "Status :" + emp.status;
    
                            writer.write(dataline);
                            writer.newLine();
                        }
                     
                    }
    
                    
        }
    
        catch(FileNotFoundException e){
            System.out.println("File not foun:" + e.getMessage());
    
        }
    
        catch(IOException e){
            System.out.println("File could not update" + e.getMessage());
        }
    
        file.delete();
        tempfile.renameTo(file);
    }

    public void buyitem(productserver obj){
          
        // ArrayList<itemarray> newarray = obj.items;

        try {
            for(itemarray elements : obj.items){
                    if(elements.name.equalsIgnoreCase(productname)){
                       if(elements.status.equalsIgnoreCase("return") || elements.status.equalsIgnoreCase("stock")){

                        elements.status = "buy";

                        buyfile(obj);
                        returnfile(obj);

                        stockfile(obj);
                        System.out.println("Data updated succefully - BUY");
                    

                          System.out.println("You have succesfully bought " + productname);

                    }

                    else{
                        System.out.println("item is not in stock");
                    }
        
                }
    
            } 

            System.out.println("You shoping has been done successfully");

        } catch (Exception e) {
        System.out.println("Could not buy !!" + e);
        }
         
    }

    public void returnitem(productserver obj){

        try{
        for(itemarray elements : obj.items){
            if(elements.name.equalsIgnoreCase(productname)){
                if(elements.status.equalsIgnoreCase("buy") ){
                     elements.status = "return";
                     System.out.println("You have returned the item successfullu");
                     // file handling function

                     returnfile(obj);
                     buyfile(obj);
                     stockfile(obj);
                }
                else{
                    System.out.println("there is no item bought");
                }
            }

            else{
                System.out.println("There is no such item in the list");
            }
        }
           }
       catch(Exception e){
        System.out.println("You return process could not be completed"+ e);
         }
    }

    public void showdetails(productserver obj){
        int a = 0;

        System.out.println("All items data");
        for(itemarray elements : obj.items){
            a++;
            System.out.println(a);
            System.out.println("Product name :" + elements.name + " " + "Price " + elements.price + " " + "Quantity "+ elements.qty + " " + "Status " + elements.status);
        }
    }


    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }
}

class sellermanager extends roll{

  String itemname ;
  int itemqty ;
  int itemprice;
         //   String itemstatus;


    public sellermanager(int rollperson, String itemname,int itemqty, int itemprice ){
        super(rollperson);
        this.itemname = itemname;
        this.itemqty = itemqty;
        // this.itemstatus =  itemstatus;
        this.itemprice = itemprice; 
    }








    public void addingitems(productserver obj){

        obj.items.add(new itemarray(itemname, itemqty, itemprice));


        customermanager obj1 = new customermanager(1, "something");

        obj1.stockfile(obj);
        obj1.buyfile(obj);
        obj1.returnfile(obj);
        System.out.println("Your item" + itemname + " " + "is added successfully");

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }
}

public class productserver {
  public static   ArrayList<itemarray> items = new ArrayList<>();
    
   static final String  BUY_FILE = "buyproducts.txt";
   static final String RETURN_FILE= "returnitem.txt";
   static final String STOCK_FILE = "stockitem.txt";
//    static final String
   
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean runningstatus = true;
        // System.out.println("Please enter the roll");

        productserver newobj = new productserver();

    items.add(new itemarray("watch", 1, 50000));
    items.add(new itemarray("mouse", 1, 90000));
    items.add(new itemarray("book", 1, 906606));
    items.add(new itemarray("belt", 1, 906606));
 



        while(runningstatus){

        
            System.out.println("1. For customer");
            System.out.println("2. For seller");
            int rollchoice = sc.nextInt();
              if(rollchoice == 1 ){

            System.out.println("Enter the name of the product :");
            String nameproduct = sc.next();

            customermanager customerclass = new customermanager(rollchoice, nameproduct);

            System.out.println("1. To buy");
            System.out.println("2. To return");
            System.out.println("3. To see stock");

            int tastview = sc.nextInt();



            switch (tastview) {
                case 1:

                productserver productserver1 = new productserver();
                customerclass.buyitem(productserver1);
                    
                    break;    
                    case 2:
                    
                    productserver productserver2 = new productserver();
                    customerclass.returnitem(productserver2);
                    break;    
                    
                    case 3:
                    
                    productserver productserver3 = new productserver();
                    customerclass.showdetails(productserver3);
                    break;
            
                default:
                System.out.println("please enter valid value");
                    break;
            }
        }

        else if(rollchoice == 2){


              System.out.println("Enter the details of the product you want to add in the list");

              System.out.println("Name:");
              String nameofproduct = sc.next();
              System.out.println("Quantity:");

              int qtyproduct = sc.nextInt();
              System.out.println("Price:");

              int priceproduct = sc.nextInt();
              System.out.println("Status:");
              
            //   String statusproduct = sc.nextLine();


        //  sellermanager sellclass = new sellermanager(rollchoice, nameofproduct, rollchoice, rollchoice, nameofproduct);
             sellermanager sellclass = new sellermanager(rollchoice, nameofproduct, qtyproduct, priceproduct);
             productserver productserver1 = new productserver();
             sellclass.addingitems(productserver1);
        }

        else{
            runningstatus = false;
            System.out.println("System terminated");
        }

    }

        sc.close();
    }
}
