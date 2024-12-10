public class staticvar {
    int x;
    static int y;

    void static_check(){
        System.out.println(x);// the non static variable take the default value a garbage value
        System.out.println(y);//the static variable take the default value "0"
    }
    public static void main(String[] args) {
    
    staticvar pp = new staticvar();
    pp.static_check();
    }
}
