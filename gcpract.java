public class gcpract{  
    public void finalize(){System.out.println("object is garbage collected");}  
    public static void main(String args[]){  
        gcpract s1=new gcpract();  
        gcpract s2=new gcpract();  
     s1=null;  
     s2=null;  
     System.gc();  
    }  
   }  
   