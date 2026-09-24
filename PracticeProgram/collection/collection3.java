import java.util.ArrayList;

public class collection3 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("ramcharan");
        names.add("bob");
        names.add("bhai");
        System.out.println("names="+names);
        names.remove(2);
        System.out.println("after removing elements are="+names);
        
    }
}
