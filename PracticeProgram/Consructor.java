class student{
    String name;
    student(){
        name="gopi";
        System.out.println("constructor is  called");
     }
     public static void main(String[] args) {
         student s=new student();
         System.out.println("student name:"+s.name);
     }
}
