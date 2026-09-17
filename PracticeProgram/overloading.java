class java{
    void subject(int a,int b){
        System.out.println("add="+(a+b));
    }
}
class ds extends java{
    //overloading
    void subject(int a,int b,int c){
        System.out.println("add="+(a+b+c));
    }
}

public class overloading {
    public static void main(String[] args) {
        ds D=new ds();
        D.subject(100,100,100);
    }
}
