
import java.util.Scanner;
class Student{
    int age;
    String name;
    float cgpa;
      
    public static void main(String a[]) {
        Student obj=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student Name ");
        obj.name=sc.next();
        System.out.print("Enter Student Age ");
        obj.age=sc.nextInt();
        System.out.print("Enter Student CGPA ");
        obj.cgpa=sc.nextFloat();
        System.out.println("Student Name Is : "+obj.name);
        System.out.println("Student Age Is : "+obj.age);
        System.out.println("Student CGPA Is : "+obj.cgpa);
        
    }
}
