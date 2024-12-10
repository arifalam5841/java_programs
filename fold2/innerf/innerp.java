package fold2.innerf;

import java.util.ArrayList;

class student {
    String name;
    String fathername;
    String mothername;
    public student(String name, String fathername, String mothername){
        this.name  = name;
        this.fathername = fathername;
        this.mothername = mothername;
    }
}
public class innerp {
    ArrayList<student> list = new ArrayList<>();

    
    public void addingdata(String name, String fathername , String mothername){

        
        try{
            list.add(new student(name,fathername,mothername));
            System.out.println("Data enter succesfully");
            int i = 0;
            for(student each : list){
            
                i++;
                System.out.println(i);
             System.out.println("Name :" +each.name );
             System.out.println("Father name:"+ each.fathername);   
             System.out.println("Mother name:"+ each.mothername);   
            }

        }catch(Exception e){
            System.out.println(e);
        }

    }
}
