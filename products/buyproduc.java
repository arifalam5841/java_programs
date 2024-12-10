package products;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.annotation.processing.FilerException;


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

public class buyproduc {
    
    public void buymethod(ArrayList obj){
            File file = new File("buyproducts.txt");
    File tempfile = new File("tempbuyproduct.txt");


    try(BufferedReader reader = new BufferedReader(new FileReader(file));
     BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile))){

        
                // for(itemarray emp : obj){
                    // String dataline = "Product : " + emp.name + " " + "Quatity: " + emp.qty + " "+  "Price : "  + emp.price + " " + "Status :" + emp.status;

                    // writer.write(dataline);
                    // writer.newLine();
                // }

                
    }

    catch(FileNotFoundException e){
        System.out.println("File not foun:" + e.getMessage());

    }

    catch(IOException e){
        System.out.println("File could not update" + e.getMessage());
    }

    file.delete();
    tempfile.renameTo(file);
    System.out.println("Data updated succefully - BUY");


    }
}
