class one {
    void Man(){
        int a=100;
        int b=100;
        System.out.println("add="+(a+b));
        System.out.println("who are u");
    }
    void display(int a,int b){
        System.out.println("a+b=100");
    }
}
class two{
    float p=10.5f;
    float q=10.5f;
    void Mens(){
        System.out.println("value="+(p+q));
    }

}

public class methodes {

    public static void main(String[] args) {
        one o=new one();
        two t=new two();
        o.Man();
        o.display(10,20);
        t.Mens();
    
 }   
}
