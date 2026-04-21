class Student{
    String name;
    int age;
    public void getInfo(){
        System.out.println("The name of student is:"+ this.name);
        System.out.println("The age of student is:"+ this.age);
    }
}

public class Oops2 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Ankit Pandey";
        s1.age=23;
        s1.getInfo();

        Student s2=new Student();
        s2.name="Sakshi Sinha";
        s2.age=23;
        s2.getInfo();

    }
}
