import java.io.Serializable;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import javax.sound.midi.SysexMessage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class SerializationsP {

    public static void deserializationfile(){
        try {

            FileInputStream readingfile = new FileInputStream("f.txt");
            ObjectInputStream finalreading = new ObjectInputStream(readingfile);

            Student s = (Student)finalreading.readObject();

            System.out.println(s.id + " " + s.name);
            
            finalreading.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

boolean running = true;
        while (running) {
            System.out.println("Enter name:");
          String name = sc.next();
          System.out.println("Enter age: ");
          int age =  sc.nextInt();         
          System.out.println("Enter id :");
          int id = sc.nextInt();
          try {
            Student s1 = new Student(id, name, age);

            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject(s1);
            out.flush();
            System.out.println("Success !!");

            out.close();
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




        deserializationfile();
               
          System.out.println("do you want to continue ? ");
          String choice = sc.next();

          if(choice.equalsIgnoreCase("yes")){
            running = true;
          }

          else{
            running = false;
          }
        }
   
    }
}
