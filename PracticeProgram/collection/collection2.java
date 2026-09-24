import java.util.ArrayList;

public class collection2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("naik");
        names.remove("mahesh");
        names.add("varun");
        System.out.println("names="+names);
        names.remove(0);
        System.out.println("after removing element="+(names));
    }
}
