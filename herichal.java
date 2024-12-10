import java.util.Scanner;

class A {
    int a;
    int b;

    void getdata(int a, int b){
        this.a = a;
        this.b = b;
    }
}

class B extends A { // it is indirect inheritance means inherit the class A and then inherit the class B
   int sum(){
    return a+b;
   }
}

class C extends A { // it is direct inheritance means directly inherit the class A
    void sub(){
        
        System.out.println("Subtraction of a and b is :" + (a-b));
    }
}

class D extends A {
    void even_odd(int value){
        if(value % 2 == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }

    }
}

public class herichal {
    public static void main(String[] args) {
        C obj = new C();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();

        obj.getdata(a, b);
        obj.sub();
        
        B obj1 = new B();
       
        obj1.getdata(a, b);
        System.out.println("Sum of a and b is :" + obj1.sum());
        
        D obj2 = new D();
        obj2.even_odd(obj1.sum());
        sc.close();
    }   
}
