import java.util.Scanner;



class first {
    void gettingdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String a = sc.nextLine();

        // Character achar = a.toCharArray();

        // System.out.println(a.length());
        String news = "";
        for (int i = a.length() - 1; i >= 0; i--){

          

            char chdr = Character.toLowerCase(a.charAt(i)); // Get character in lowercase
              news += chdr; // Append each character to the news string

        }

        System.out.println(news);
        sc.close();

        

    }
    



}


public class stringrev {





  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);

   System.err.println("Enter a name : ");

   String name = sc.nextLine();

   String revname = new StringBuilder(name).reverse().toString();

   if(name.equalsIgnoreCase(revname)){
    System.out.println("it a palidrome");

   }
   else{
    System.out.println("It is not a palidrome");
   };
  
int vnumber = 0;
   for(int i=0; i < name.length(); i++){

    Character chr = Character.toLowerCase(name.charAt(i));

    if(chr == 'a' || chr == 'e'|| chr == 'i' || chr == 'o' || chr == 'u'){

        vnumber++;
    }

    }

    System.out.println("The number of vowels are :" + vnumber);

    first objs = new first();
    objs.gettingdata();
   };


}

