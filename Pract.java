interface A {
    void add();
}

interface B {
    int area(int x, int y);
}

public class Pract implements A, B {
    public void add() {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }

    public int area(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        Pract obj = new Pract();
        A obj1 = new Pract(); // For calling each interface
        B obj2 = new Pract(); // For calling each interface

        int s = obj.area(5, 5);
        System.out.println(s); // This will print 25
        obj.add();
    }
}
