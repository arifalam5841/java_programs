public class oppretors {
    public static void main(String[] args) {
        int a,b,c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        c = a / b;

        System.out.println("The answer is :"+ c);
    }
}


class oppretor2 {
    public static void main(String[] args) {
        int radii;
        double rslt;
        
        radii = Integer.parseInt(args[0]);

        rslt = 22/7 * radii*radii;
        
        System.err.println("The area of the circle is :"+ rslt);

    }
}


class oppretor3 {
    public static void main(String[] args) {
        int a,b,c;
    
        
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        c =  a *b;

        
        
        System.err.println("The area of the rectangle is :"+ c);

    }
}

class oppretor4 {
    public static void main(String[] args) {
        int a,b,c,d;
        double avg;
    
        
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);

        d = a+b+c;
        avg = d/3;
        
        
        System.err.println("The total is:"+ d);
        System.err.println("The average is:"+ avg);

    }
}


class oppretor5 {
    public static void main(String[] args) {
        double sallary,da,hra,gross;

        sallary = Double.parseDouble(args[0]);
        
        da = sallary * 5/100;
        hra = sallary * 10/100;
        gross = sallary + da + hra;

        System.out.println("sallary : "+ sallary  + "\n Da :"+ da+ "\n HRA :"+ hra+ "\n gross :" + gross);


    

    }
}