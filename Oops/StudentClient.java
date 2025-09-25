package Oops;

public class StudentClient {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        Student s=new Student();
        s.name="Kaju";
        s.age=18;
        System.out.println(s.name);
        System.out.println(s.age);
        Student s1=new Student();
        s1.name="kamlesh";
        s1.age=21;
        s1.Intro_yourself();
        Student s2=new Student();
        s2.name="rajan";
        s2.age=32;
        s2.sayHII("Ramesh");
        Student.sayMentorName();
       
    }
     static{
            System.out.println("I am in main");
        }
    
}
