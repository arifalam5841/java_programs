import java.util.ArrayList;
// import java.util.Vector;

class mygen<t1,t2,t3,t4> {
    t1 var1;
    t1 var2;
    t1 var3;
    t2 var4;
    t3 var5;
    t4 var6;

    public mygen(t1 var1, t1 var2, t1 var3   , t2 var4 ,t3 var5, t4 var6){
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
        this.var5 = var5;
        this.var6 = var6;
    }




    public t1 getName(){
        return var1;
    }

    public t2 getid(){
        return var4;
    }

    public t3 getSalary(){
        return var5;
    }
    @Override
    public String toString() {
        return (var1 != null ? var1.toString() : "null") + " " +
               (var2 != null ? var2.toString() : "null") + " " +
               (var3 != null ? var3.toString() : "null") + " " +
               (var4 != null ? var4.toString() : "null") + " " +
               (var5 != null ? var5.toString() : "null") + " " +
               (var6 != null ? var6.toString() : "null");
    }

}


public class gene1 {
    
    ArrayList<mygen<?, ?, ?, ?>> myinfo;

    public gene1()
{
    myinfo = new ArrayList<>();
} 

public void addinginfo(){
    mygen<String,Integer, Double,Boolean> newobj = new mygen<>("Arif", "badre", "sajda", 1, 5555.55, false);

    mygen<String,String, Integer,Integer> newobj2 = new mygen<>("Arif", "badre", "sajda", "taloja", 55, 99);

    
   myinfo.add(newobj);

   myinfo.add(newobj2);


}


public void searchperson(String name){


    for(mygen<?,?,?,?> person : myinfo){
        if(person.getName().toString().equalsIgnoreCase(name)){ // if you want to search from a array with generic make the searched keyword to the same obj type as the parameter has

            System.out.println("ID:");
            System.out.println(person.getid());
            System.out.println("Salary:");
            System.out.println(person.getSalary());
            
        }
    }

}


public void display(){

    for(mygen<?, ?, ?, ?> element : myinfo){
        System.out.println(
            element
        );
       }
}




public static void main(String[] args) {
 gene1 obj = new gene1();
 
 obj.addinginfo();
 obj.addinginfo();

 obj.display();

 obj.searchperson("arif");

}


}
