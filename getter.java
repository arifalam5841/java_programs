

    class Emp{
        private int empcode;

        public int getempcode(){
            return empcode;
        }


        public void setempcode(int empcode){
            this.empcode = empcode;
        }
    }

    class manager{
        Emp aa = new Emp();

        public void setnewcode(){

            
            aa.setempcode(7005);


        }

        public void newdisplay(){

           

            System.out.println( aa.getempcode());
        }
    }

public class getter {
   

    public static void main(String[] args) {
        
        Emp ee = new Emp();

        ee.setempcode(502);

        System.out.println("ID :" + ee.getempcode());

        ee.setempcode(55);

        System.out.println("ID 2 :" + ee.getempcode());

        manager managerclass = new manager();
        managerclass.newdisplay();
    }
}
