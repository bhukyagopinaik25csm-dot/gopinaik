public class one{
    int a=20;
    int b=30;
    void displaynumbers(){
        System.out.println("first number:"+ a);
        System.out.println("scecond number;"+ b)
    }
}
public class two extends two({
    void addition(){
        System.out.println("additin:"+(a+b));
    }   
}
class three extends two({
    void multiplications(){
        System.out.println("multiplications:"+(a*b));
    }
}
public main class{
    public static void main(string[] args){
        three t = new three();
        t.displaynumbers();
        t.addition();
        t.multiplicatins();
    }
}
