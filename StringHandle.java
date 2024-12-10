import java.util.Scanner;

public class StringHandle {
    public static void main(String[] args) {
        String name = "Arif";
        String name2 = "Alam";
        String name3 = name + " " + name2;
        
        System.out.println(name3.toUpperCase());
        System.out.println(name3.toLowerCase());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 'give length' to get the length of the name: ");
        String question = sc.nextLine();
        String q2 = question.toLowerCase();

        if (q2.equals("give length")) {
            System.out.println(name3.length());
        } else {
            System.out.println("Invalid input");
        }
        
        sc.close();
    }
}
