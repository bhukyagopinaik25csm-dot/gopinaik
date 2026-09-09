interface inter1{
    void display(int a,int b);
    void add();
}
interface inter2 extends inter1{
    void add();
    void display(int a,int b);
}
class inter3 implements inter1,inter2{
    int x=1;
    int y=2;
    void ad(){
          System.out.println("add="+(x+y));
    }
    void disc(int a ,int b){
        System.out.println("sub="+(a-b));
    }

}
public class interfaces {
    public static void main(String[] args) {
        inter3 obj=new inter3();
        obj.display(20,10);
        obj.add();
    }
}
