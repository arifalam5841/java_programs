class Emp {
    int id;
    String nm;
    double sal;

    void getEmpDetails(int eid, String enm, double esal) {
        id = eid;
        nm = enm; // Corrected assignment
        sal = esal;
    }
}

class acounts extends Emp {
    double da, hra, gross;

    void salarycal() {
        da = sal * 5 / 100;
        hra = sal * 10 / 100;
        gross = sal + da + hra;
    }

    void display() {
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + nm);
        System.out.println("Employee Salary: " + sal);
    }
}

class secondc extends acounts {
    void display_total() {
        salarycal(); // Call salarycal to ensure da, hra, and gross are calculated
        double total_data = da + hra + gross;
        System.out.println("Total Salary Components: " + total_data);
    }
}

public class inheri {
    public static void main(String[] args) {
        acounts obj = new acounts();
        obj.getEmpDetails(111, "Arif Alam", 999999999);
        obj.salarycal();
        obj.display();

        secondc obj2 = new secondc();
        obj2.getEmpDetails(111, "Arif Alam", 999999999); // Also set employee details for obj2
        obj2.display_total();
    }
}
