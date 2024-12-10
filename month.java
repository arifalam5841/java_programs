public class month {
    public static void main(String[] args) {
        String mnt;

        mnt = args[0];

        switch (mnt) {
            case "jan":
            case "march":
            case "may":
            case "jul":
            case "aug":
            case "oct":
            case "dec":
            System.out.println("Number of days are : 31");               
                break;


                case "april":
            case "jun":
            case "sep":
            case "nov":
           
            System.out.println("Number of days are : 30");               
                break;

                case "feb":
                System.out.println("Number of days are : 28"); 
                break; 
            default:
            System.out.println("Enter valid value");  
        }
    }
}

class forloop {
    public static void main(String[] args) {
        String mnt;

        mnt = args[0];

        String[] months1 = {"jan","march","may","jul","aug","oct","dec"};
        String[] months2 = {"april","june","sept","nov"};

        for(String value: months1){
            if( mnt.equalsIgnoreCase(value)){
                System.out.println("31");
                break;
            }
            // else if (mnt == months2[i]){
            //     System.out.println("30");
            // }

            // else if(mnt == "feb"){
            //     System.out.println("28");
            // }
            else {
                System.out.println("invalid");
                break;
            }
        }

    }
   
        
}
