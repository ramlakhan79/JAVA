import java.util.Scanner;
class Emp{
        String name;
        int age;
        int salary;
    public static void main(String a[])
    {
        Emp obj=new Emp();
        
        Scanner sc=new Scanner(System.in);
       
        obj.name=sc.next();
        System.out.println("Name : "+obj.name);
      
        obj.age=sc.nextInt();
        System.out.println("Age : "+obj.age);
       
        obj.salary=sc.nextInt();
        System.out.println("Salary : "+obj.salary);
    }
}