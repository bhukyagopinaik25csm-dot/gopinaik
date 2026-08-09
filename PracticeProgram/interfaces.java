public interface vehicle {
    void start();
}
public class  car implements vehicle{
    public void start(){
        System.out.println("car started");
    }
}
public class main(){
    public static void main(string[] args){
        car c=new car();
        car.start();
    }
}
