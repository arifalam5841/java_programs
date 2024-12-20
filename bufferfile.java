import java.io.*;
import java.nio.file.FileVisitResult;
import java.util.ArrayList;

class studentdata{
    String name;
    int id;
    String std;

    public studentdata(String name, int id, String std){
        this.name = name;
        this.id = id;
        this.std = std;
        
    }

}

public class bufferfile {

    static ArrayList<studentdata> studetarray = new ArrayList<>();


    public static void displaystudent(){
        for(studentdata eachstudent : studetarray){
            System.out.println("Name: " + eachstudent.name + " Id : " + eachstudent.id + " Class: " +eachstudent.std);
        }
    }


    public static void readfile() {
        try{
            FileReader readfile = new FileReader("bufferoddutput.txt");
            

            // BufferedInputStream bufferreader = new BufferedInputStream(readfile);
            BufferedReader bufferreader = new BufferedReader(readfile);

            String i;

            while ((i=bufferreader.readLine())!= null) {

                System.out.println(i);
                
            }

            bufferreader.close();

        }

        catch(IOException err){
            System.out.println(err);
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("errorfile.txt"))){
            // try(BufferedWriter writer = new BufferedWriter(new FileWriter("errorfile.txt", true))){  // this is to append
                writer.write(err.getMessage());
                writer.newLine();
            }
    
            catch(IOException e){
                System.out.println("Error :" + e.getMessage()  );
    
    
            }
    
        }
    }


    public static void bufferoutput()throws Exception{
        
        FileOutputStream newoutput = new FileOutputStream("bufferoutput.txt");

        BufferedOutputStream newbufferoutput = new BufferedOutputStream(newoutput);

        String s = "This is a byte String";

        byte b[] = s.getBytes();

        newbufferoutput.write(b);
        newbufferoutput.flush();

        newbufferoutput.close();
    }


    public static void main(String[] args) throws Exception{


        studetarray.add(new studentdata("arif",4  , "10"));
        studetarray.add(new studentdata("rohan",85  , "8"));
        


        FileWriter file = new FileWriter("bufferfile.txt");

        BufferedWriter bufferwrtie = new BufferedWriter(file);

        for(studentdata eachstudent : studetarray){
            String dataline = "Name: " + eachstudent.name + " Id : " + eachstudent.id + " Class: " +eachstudent.std;
            bufferwrtie.write(dataline+ "\n");

        }


        bufferwrtie.close();



        // displaystudent();

        readfile();

 
        
        bufferoutput();


    }
}
