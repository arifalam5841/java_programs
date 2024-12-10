class exception {
    void checkage(int age){
        if (age<18){
            throw new ArithmeticException("not eligible");
        }
        else{
            System.out.println("eligible");
        }
    }
}

class ageException extends Exception{
    ageException(String s){
        super(s);

    }
}

class throwkey {
    public static void agechecker(int age) throws ageException{
        
        if (age<18){
            throw new ageException("not eligible");
        }
        else{
          throw new ageException("eligible");
        }  
    }
}