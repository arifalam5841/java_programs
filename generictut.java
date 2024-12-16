import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

class mygeneric<t1>{
    private t1 data1;
    private t1 data2;

    int age ;

    public mygeneric(t1 data1,t1 data2, int age){

        this.data1 = data1;
        this.data2 = data2 ;
        this.age = age;
    }


    public t1 displayT1(){
       
        return data1;
    }

    public int getint(){
        return age;
    }


    @Override 
    public String toString(){
        return "Name" + data1 + "Class" + data2 + "Age " + age;
    }


}

public class generictut {

    Vector<String> studentdata;

    public generictut(){
        studentdata = new Vector<>();
    }

    public void addingstudent(){
        
    }


 public static void main(String[] args) {
    mygeneric<String> obj1  = new mygeneric("Arif alam", "10th", 17);





    System.out.println(obj1.displayT1());
 }
    
}