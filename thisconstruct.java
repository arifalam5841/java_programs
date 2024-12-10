class B{

    // it is just like variable and return type but here we are getting class as a variable and the get the data from the class
    thisconstruct obj;


    B(thisconstruct obj){
             this.obj = obj;
    }

    void displaydata(){
        System.out.println("The data is :" + obj.data);
    }
}

class C {
    B getdata(){

        B objs = new  B(new thisconstruct());
        return objs;

    }
}




 class thisconstruct {

    int data = 55;
    // public static void main(String[] args) {
        
    // }
    
    // thisconstruct(){
    //     B b = new B(this);
    //     b.displaydata();
    // }

    void displayingdata(){
                B b = new B(this);
        b.displaydata();
    }

    public static void main(String[] args) {

        thisconstruct mainobj = new thisconstruct();
        mainobj.displayingdata();
        

        C obj2 = new C();

        System.out.println("This is from another variable");
        obj2.getdata().displaydata();
        
    }
}
