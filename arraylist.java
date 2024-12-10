import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class arraylist {


    public static void main(String[] args) {
        ArrayList<List<String>> nestedlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the name");
        String name = sc.nextLine();
       
        System.out.println("enter the id");
        int id = sc.nextInt();

        System.out.println("enter the class");
        String class_name = sc.next();

        // sc.nextLine(); // Consume leftover newline after nextInt()
        nestedlist.add(Arrays.asList(name,String.valueOf(id),class_name));

        System.out.println(nestedlist.get(0).get(2));
    }
}

