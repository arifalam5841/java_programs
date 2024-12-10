import java.util.ArrayList;

class Student {
    String name;
    int age;
    int studentClass;

    public Student(String name, int age, int studentClass) {
        this.name = name;
        this.age = age;
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Class: " + studentClass;
    }
}

public class classarray {
    public static void main(String[] args) {
        // Create a list to store Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Add student objects to the list
        students.add(new Student("Alice", 15, 5));
        students.add(new Student("Bob", 16, 6));

        // Print each student's details
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println(students.get(0));
    }
}
