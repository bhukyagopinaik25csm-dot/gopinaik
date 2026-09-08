
public class scanner {
    public static void main(String[] args) {
        scanner sc =new scanner();
        System.out.println("enter your name");
        String name = Sc.nexLine();
        System.err.println("enter your age");
        int age =sc.nextInt();
        System.out.println("Name="+name);
        System.out.println("age="+age);
        sc.close();
    }
}
