package ie.atu;
import java.util.Scanner;

class Student {
    private String name;
    private String email;
    private String course;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }
}

public class StudentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create three instances of the Student class

        // Student 1 is initialized using setters
        Student student1;

        // Student 2 is initialized using a constructor
        Student student2;

        // Student 3 is initialized using a constructor
        Student student3;

        // Prompt the user to enter information for the first student
        System.out.println("Enter the details for the first student:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Email: ");
        String email1 = scanner.nextLine();
        System.out.print("Course: ");
        String course1 = scanner.nextLine();

        // Initialize student1 using setters
        student1 = new Student(name1);
        student1.setEmail(email1);
        student1.setCourse(course1);

        // Prompt the user to enter information for the second student using a constructor
        System.out.println("Enter the name for the second student:");
        String name2 = scanner.nextLine();
        System.out.print("Email: ");
        String email2 = scanner.nextLine();
        System.out.print("Course: ");
        String course2 = scanner.nextLine();

        // Initialize student2 using a constructor
        student2 = new Student(name2, email2, course2);

        // Prompt the user to enter information for the third student using a constructor
        System.out.println("Enter the details for the third student:");
        System.out.print("Name: ");
        String name3 = scanner.nextLine();
        System.out.print("Email: ");
        String email3 = scanner.nextLine();
        System.out.print("Course: ");
        String course3 = scanner.nextLine();

        // Initialize student3 using a constructor
        student3 = new Student(name3, email3, course3);

        // Print the details of all three students
        System.out.println("Student 1 Details:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Email: " + student1.getEmail());
        System.out.println("Course: " + student1.getCourse());

        System.out.println("Student 2 Details:");
        System.out.println("Name: " + student2.getName());
        System.out.println("Email: " + student2.getEmail());
        System.out.println("Course: " + student2.getCourse());

        System.out.println("Student 3 Details:");
        System.out.println("Name: " + student3.getName());
        System.out.println("Email: " + student3.getEmail());
        System.out.println("Course: " + student3.getCourse());

        scanner.close();
    }
}
