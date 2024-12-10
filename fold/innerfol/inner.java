package fold.innerfol;

class base {
    int x , y;
    public void cal(int a, int b ){
        x = a;
        y = b;
    }
}

public class inner extends base {
    public void display(){
        System.out.println(x+y);
    }
}
