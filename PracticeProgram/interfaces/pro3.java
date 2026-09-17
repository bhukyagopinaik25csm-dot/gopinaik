
interface Student {
    void displayName();
}

class CollegeStudent implements Student {
    public void displayName() {
        String name = "Gopi";
        System.out.println("Student Name: " + name);
    }
}

public class pro3 {
    public static void main(String[] args) {
        CollegeStudent s = new CollegeStudent();
        s.displayName();
    }
}