public class triangle {
    public static void main(String[] args) {
        int side1,side2,side3;

        side1 = Integer.parseInt(args[0]);
        side2 = Integer.parseInt(args[1]);
        side3 = Integer.parseInt(args[2]);

        if(side1 == side2 && side2 == side3){
            System.out.println("The triangle is equilateral");
        }


        else if (side1 != side2 && side2 != side3 && side3 != side1){
            System.out.println("The triangle is scalane");
        }
              

        else if (side1 == side2 || side2 == side3 || side3 == side1){
            System.out.println("The triangle is  isoslace");
  }



         

        else{
            System.out.println("The triangle is nothing");
        }

        
    }
}
