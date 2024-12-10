final class A {  // if we put fina at the starting of class it cant be iheritent by any class 
    void show(){
        System.out.println("Show called from A");
    }
}

// class B extends A{
//   void display(){
//     System.out.println("display from B");
//   }


class C {
   final void show(){  // if write final on the startiing of a method then the same method name can't be called in another class
        System.out.println("This show is from C");
    }
}


class D extends C{
    void show(){
        System.out.println("This show is from D");
    }
}
// }


public class finalvariable {
    public static void main(String[] args) {
        final  int a = 0; // we can't change the variable is we put final at the starting of the variable
        System.out.println(a);
        // a= 30;
        System.out.println(a);

        // B obj = new B();

        D obj  = new D();

        obj.show();
    }
}
