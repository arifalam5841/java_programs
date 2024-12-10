abstract class parent {
    void sound (){}
    String name ,secondname;
    public parent(String name,String secondname){
        this.name = name;
        this.secondname = secondname;
    }
}

class dog extends parent{

    // publ
    void sound (){
        System.out.println("Bhau Bhau");
        System.out.println(name);
        System.out.println(secondname);
        
    }
// ic dog(String name, String secondnames) {
    //     super(name, secondnames);
    // }

   public dog(String name,String secondname){         
    super(name, secondname); // Pass empty string as second parameter to match parent constructor
   }
}

class cat extends parent {
    public cat(String name, String secondnames) {
        super(name, secondnames);
    }
    
    public  void sound(){
        System.out.println("Meow Meow");
        System.out.println(name);
        System.out.println(secondname);
        
    }

     String gettingnames(){
        return name;
    }

         String displayname(){
           
            return name;

            
        }



}


class diplaydata extends cat{


    public diplaydata(String names,String second){
          super(names,second);
          
    }
   public static void displaydatas() {
    displaydatas();

    

    }
    
 

    
    
}


public class abstracts{
    public static void main(String[] args) {
        dog obj1 = new dog("dog in this", "this is the second");
        obj1.sound();
        cat obj2 = new cat("cat in this", "this is the second");
        // obj2.sound();
      
        diplaydata obj3 = new diplaydata("This is from displaydata","this is second from display data ");

        obj3.displayname();
       obj3.displaydatas();
    }
} 