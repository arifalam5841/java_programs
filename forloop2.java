public class forloop2 {
    public static void main(String[] args) {
        int a;
        a =1;
        while (a <= 50) {
            a++;
            if(a%5 == 0 && a%7 == 0){
                System.err.println(a);
            }
            // else{
            //     System.err.println(a + " is not even number ");
            // }
        }
    }
}
