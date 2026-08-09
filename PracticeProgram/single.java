class Person {
    String name = "Rahul";

    void displayName() {
        System.out.println("Name: " + name);
    }
}


class Student extends Person {
    int rollNumber = 101;

    void displayRollNumber() {
        System.out.println("Roll Number: " + rollNumber);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.displayName();          
        s.displayRollNumber();    
    }
}
