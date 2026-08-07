class person{
    string name = "gopi naik ";
    int age =18;
    void displayperson(){
        System.out.println("name:"+ name);
        System.out.println("age:"+age);
    }
}
class teacher extends persons{
    string subject="java";
    void displayteacher(){
        System.out.println("subject:"+subject);
    }
}
public main class(){
    public static void main(string[] args){
        teacher t = new teacher();
        t.displayperson();
        t.displayteacher();
    }
}