public class switchcase {
    public static void main(String[] args) {
        int no;
        no = Integer.parseInt(args[0]);

        switch (no) {
            case 1:
                  System.out.println("you are in  case 1");
                break;

                case 2:
                    System.out.println("you are in  case 2");
                break;
        
            default:

                   System.out.println("please enter valid number");
                break;
        }
    }
}
