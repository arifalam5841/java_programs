class parent{
    int a =  5;
    int b =7;

   void display(){
    System.out.println("The multiplicaction of a and b is" + (a*b));
   }
}

class child extends parent {
    void display(){
        System.out.println("First display");
        super.display(); // to call the display method of the parent class
        System.out.println("Second diplay");
        System.out.println("The addition of a and b :" +(a+b));
    }
}

public class superr {

    public static void main(String[] args) {
        child obj = new child();

        obj.display();
    }
}