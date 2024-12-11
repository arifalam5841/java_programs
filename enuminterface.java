import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

// import enummethod.days;

class products{
    String name;
    int price;
    String company;

    public products(String name, int price, String company){
        this.name = name;
        this.price = price;
        this.company = company;
    }


    @Override
    public String toString(){
        return "Name: " + name + " Price: " + price + " Company: " + company;
    }
}

public class enuminterface {

    public static void main(String[] args) {
        //create a vector and add elements

        Vector<String> vector = new Vector<>();

        vector.add("Arif");
        vector.add("alam");
        vector.add("rohan");
        vector.add("raj");

        //get the enumeration object

        Enumeration<String> enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {

            System.out.println(enumeration.nextElement());
            
        }

        Vector<Integer> newvector = new Vector<>();
        newvector.add(1);
        newvector.add(5);
        newvector.add(2);
        newvector.add(9);

        System.err.println(newvector.get(0));
        System.err.println(newvector);

        Enumeration newenum = newvector.elements();
while (newenum.hasMoreElements()) {
    System.out.println(newenum.nextElement());
}
    // CAN'T MAKE A ARRAY ENUMRATION , IT IS ONLY FOR VECTOR


    Vector<products> classvector = new Vector<>();

    classvector.add(new products("bottle", 25, "Mirinda"));
    classvector.add(new products("charger", 2500, "Samsung"));


    Enumeration<products> classenum = classvector.elements();


    while (classenum.hasMoreElements()) {
        // System.out.println(classenum.nextElement());
    // String a =  classenum.nextElement().toString();
    // System.out.println(a);

    products nextproduct = classenum.nextElement();

    System.out.println(nextproduct.name);
        
    }
    }
}