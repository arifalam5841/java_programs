import java.util.Scanner;

public class repo {

    String name;
    int rollno;
    
    int[] marks;
    int total_mark;

    repo(String name, int rollno, int[] marks,int total_mark){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
        this.total_mark = total_mark;
        
    }

   int  totalmarks(){
        int total = 0;
        for(int i = 0; i < marks.length; i++){
            total += marks[i];
        };
       return total;
    }

    double percentage(){
    int t = total_mark * 100;
      
        return (totalmarks() *100)/t;
    }
    void display(int total,double per){
        
        System.out.println("Name:" + name);
        System.out.println("Rollno:" + rollno);
        System.out.println("Total marks:" + total);
        System.err.println("percentage:" + per);

    }

    String grade(){
       if (percentage()>= 90) {
        return "A";

       }
       else if(percentage()>= 80){
        return "B";
       }
       else if(percentage()>= 50){
        return "C";
       }
       else{
        return "Fail";
       }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        String name = sc.nextLine();

        System.out.println("Enter the rollno :");
        int rollno = sc.nextInt();
        System.out.println("Enter the number of subject:");

        int number_of_sub = sc.nextInt();

        int[] marks = new int[number_of_sub];
        for(int i = 0; i < number_of_sub; i++){
            System.out.println("Enter the marks:" );
            marks[i] = sc.nextInt();
        }
       

        repo obj = new repo(name, rollno, marks, number_of_sub);
        System.out.println();
        obj.percentage();
        obj.totalmarks();
        obj.display(obj.totalmarks(), obj.percentage());

        System.out.println("Grade:" + obj.grade());
        sc.close();
    }
}