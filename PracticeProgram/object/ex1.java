class Student {
    String name = "Gopi";
    int age = 20;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
public class ex1 {

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.display();
    }
}
    
}
