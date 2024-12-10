import java.util.Scanner;

import fold.innerfol.inner;
import fold2.*;
import fold2.innerf.*;


class dataenter{
    String status = "not";
   
   
    void multiply(int a, int b){
        practf obj1 = new practf();
        obj1.displaydata(a, b);
        status = "done";

    }


    void addingstudent(String name, String father, String mother){
        innerp obj2 = new innerp();



        obj2.addingdata(name, father, mother);
        System.out.println("Data enter succesfully");
        status = "done";


    }

    void loop_func(){
        if(status.equalsIgnoreCase("done")){
            dataenter obj3 = new dataenter();
            Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String father = sc.nextLine();
        String mother = sc.nextLine();
        obj3.addingstudent(name,father,mother);
            loop_func();
            sc.close();
        }

        else{
            System.out.println("FUNCTION NOT COMPLETED");
        }
    }

 


}


public class main5{

   


    public static void main(String[] args) {

        dataenter obj = new dataenter();

        obj.multiply(5, 8);

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String father = sc.nextLine();
        String mother = sc.nextLine();
        obj.addingstudent(name,father,mother);
        obj.loop_func();
sc.close();


    }
}