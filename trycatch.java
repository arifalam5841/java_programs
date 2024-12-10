class exection1 {
    int a[] = new int[5];

    void display(){
        int x,y;
        x= 0;
        y = 5;
        int z = x+y;
        try{
            for(int i =0; i < z; i++){
                a[i] = i;
                System.out.println(a[i]);
            }
            
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);

        }

        finally{
            for(int i =0; i < a.length; i++){
                System.out.println(a[i]);
            }
        }



        try{
            a[6] = z;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Error in second try block");
        }
    }
}


public class trycatch {
    public static void main(String[] args) {
        
        int x,y;
        try {
            x = 10;
            y = 5;
            int z = x/y;
            System.out.println(z);
        } catch (Exception e) {
            // TODO: handle exception

            System.out.println(e);
        }

        exection1 obj = new exection1();
        obj.display();

    }
}