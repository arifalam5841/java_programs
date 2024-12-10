public class rangesum {
    public static void main(String[] args) {
        int a,b,sum,totl;
        totl = 0;
        
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        while(a<=b){
            
           
            totl = totl+a;
            a++;
           

           

            

        }

        System.out.println(totl);
       


    }
}
