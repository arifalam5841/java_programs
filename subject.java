public class subject {
    public static void main(String[] args) {
        int sub1,sub2,sub3,sum,avg;

        sub1 = Integer.parseInt(args[0]);
        sub2 = Integer.parseInt(args[1]);
        sub3 = Integer.parseInt(args[2]);
sum = sub1+sub2+sub3;
avg = sum/3;
        System.out.println("The sum is "+ sum);
        System.out.println("The avg is " + sum /3);
        // System.out.println("The sum is "+sub1+sub2+sub3);

        if(avg >= 90){
         System.out.println("Grade : A");   
        }

        else if (avg >= 80){
            System.out.println("Grade : B");  
        }

        else if (avg >= 60){
            System.out.println("Grade : C");  
        }

        else if (avg >= 35){
            System.out.println("Grade : D");  
        }

        else {
            System.out.println("FAIL"); 
        }

    }
}
