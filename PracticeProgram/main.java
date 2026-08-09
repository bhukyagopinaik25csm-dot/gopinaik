abstract class animal{
    abstract void sound();
    void eat(){
        system.out.println("animal is eating");
    }
}
class dog extends animal {
    @override
    void sound(){
        System.out.println("dogs says:bark");
    }
}
public class main{
    public static void main(String[] args) {
        dog d = new dog();
        dog.sound();
        dog.eat();
    }

}
