
interface Addition {
    void add();
}

interface Multiplication {
    void multiply();
}

class Calculator implements Addition, Multiplication {

    public void add() {
        int a = 10, b = 20;
        System.out.println("Addition: " + (a + b));
    }

    public void multiply() {
        int a = 10, b = 20;
        System.out.println("Multiplication: " + (a * b));
    }
}

public class pro4 {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.add();
        c.multiply();
    }
}