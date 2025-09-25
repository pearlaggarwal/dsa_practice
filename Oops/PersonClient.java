package Oops;

public class PersonClient {
    public static void main(String[] args) {
        // Person p=new Person();
        // System.out.println(p.name);
        // System.out.println(p.age);
        // Person p1=new Person();

        // Person p=new Person("Raj",22);
        // System.out.println(p.name);
        // System.out.println(p.age);
        // Person p1=new Person("Pooja",34);
        // System.out.println(p1.name);
        // System.out.println(p1.age);

        System.out.println("hello");
        Person p=new Person("Raj",22);
        Person p1=new Person("Pooja",21);
        p1.setAge(19);
        System.out.println(p1.getAge());
    }
}
