class studentdata{
    String name = "Arif alam";
    String college = "Kalsekar";
    int rollno =4; 

    void displaydata(){
        System.out.println("Name :" + name );
        System.out.println("College :" + college );
        System.out.println("Roll no. :" + rollno );
    }
}


 class B {
    void gettingclass(studentdata newdat){ 

        System.out.println(newdat.name);
        newdat.displaydata();
    }

    void selfdata(B mydata){
        System.out.println("This is from selfdata");
    }


    void callingmethod(){
        selfdata(this);
        System.out.println("This is calling selfdata");
    }
}
public class thisclass {
    
    public static void main(String[] args) {
        studentdata obj1 = new studentdata();

        B obj2 = new B();
        obj2.gettingclass(obj1);
        obj2.callingmethod();
    }
}
