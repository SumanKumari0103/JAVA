class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println("Name of the student is :"+this.name);
        System.out.println("Age of the student is :"+this.age);
    }

    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }

    Student(){

    }
}
//Copy Constructor
public class Constructor2 {
    public static void main(String[] args) {
       Student s1= new Student();
       s1.name="Ankit";
       s1.age=23;
       Student s2= new Student(s1); 
       s2.printInfo();
    }
}
