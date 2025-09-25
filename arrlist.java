import java.sql.Struct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;

class student{
String name;
int id;
int age;
public student(String name, int id , int age){
    this.name = name;
    this.id = id;
    this.age = age;

}
}

class employee{
    String name;
int id;
int salary;
public employee(String name, int id , int salary){
    this.name = name;
    this.id = id;
    this.salary = salary;

}
}


class customer{
    String name;
    String product;
    int price;

    public customer(String name, String product, int price){
        this.name = name;
        this.product = product;
        this.price = price;

    }
}
class book{
    String name;
    String author;
    int price;

    public book(String name, String author, int price){
        this.name = name;
        this.author = author;
        this.price = price;

    }
}

public class arrlist {

    public static void arraylinkedlist(){
        LinkedList<customer> customerlist = new LinkedList<>();

        customerlist.add(new customer("arif", "mobile", 1000));
        customerlist.add(new customer("rohan", "computer", 500)); 

        ListIterator itr = customerlist.listIterator();

        while (itr.hasNext()) {

            // System.out.println(itr.next());
            customer nextcustomer = (customer)itr.next();
            System.out.println(nextcustomer.name + " " + nextcustomer.product + " " + nextcustomer.price);
            
        }
    }


    public static void haslinkedlist(){
        LinkedHashSet<book> booklist = new LinkedHashSet<>();

        booklist.add(new book("rich dad poor dad", "robert kiosaki", 1000));
        booklist.add(new book("alchemist", "peolo celo", 500));

        // ListIterator itr = booklist.listIterator();

        // while (itr.hasNext()) {

        //     // System.out.println(itr.next());
        //     customer nextcustomer = (customer)itr.next();
        //     System.out.println(nextcustomer.name + " " + nextcustomer.product + " " + nextcustomer.price);
            
        // }

        for(book eachbook : booklist){
            System.out.println(eachbook.name + " " +  eachbook.author + " " +eachbook.price);
        }


    }
    public static void main(String[] args) {
        ArrayList<student> studentlist = new ArrayList<>();

        studentlist.add(new student("arif alam", 4, 17));
        studentlist.add(new student("Rohan", 7, 10));
        studentlist.add(new student("ram", 15, 55));




        Iterator itr = studentlist.iterator();

        while (itr.hasNext()) {
          student s = (student)itr.next();

          System.out.println(s.id  + " " + s.name + " " + s.age );
            
        }

        System.out.println(" ");

        for(student s : studentlist){
          System.out.println(s.id  + " " + s.name + " " + s.age );

        }
        ArrayList<employee> employeelist = new ArrayList<>();


        employeelist.add(new employee("arif alam", 4, 9999));
        employeelist.add(new employee("Rohan", 7, 45465));
        employeelist.add(new employee("ram", 15, 55545));


        Iterator itr2 = employeelist.iterator();
 System.out.println(" ");
        while (itr2.hasNext()) {
          employee s = (employee)itr2.next();

          System.out.println(s.id  + " " + s.name + " " + s.salary );
            
        }


        arraylinkedlist();
        haslinkedlist();
        
    }
}
