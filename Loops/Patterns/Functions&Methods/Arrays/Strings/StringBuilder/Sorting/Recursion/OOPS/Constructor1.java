class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println("Name of the student is: "+this.name);
        System.out.println("Age of the student is: "+this.age);
    }
    Student(String name, int age){
        this.name=name;
        this.age=age;
    }
}
public class Constructor1 {
   public static void main(String[] args) {
        Student s1=new Student("Ankit",23);
        s1.printInfo();
   } 
}
