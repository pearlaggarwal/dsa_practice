package Oops;

public class Student {

    String name;
    int age;
    public void Intro_yourself(){
        sayMentorName();
        System.out.println("My name is "+name+" age:"+age);
    }
    public void sayHII(String name){
        System.out.println(this.name + " Say Hii " + name );
    }
    public static void sayMentorName(){
        System.out.println("Mentor name is Monu Bhaiya");
    }
    static{
        System.out.println("I am in static block");
    }
}
