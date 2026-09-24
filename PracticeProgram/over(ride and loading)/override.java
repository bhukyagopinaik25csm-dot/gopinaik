class one{
    int a=100;
    int b=100;
    void method(){
        System.out.println("add="+(a+b));
    }
}
class two extends one{
    int a=100,b=200;
    void method(){
        System.out.println("add="+(a+b));
    }
}
public class override {
    public static void main(String[] args) {
        two T=new two();
        T.method();
    }
}
