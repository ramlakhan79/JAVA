/* Define a class student  with data member string name  int age and float cgpa .Also define method getdata
 method and showdata method for taking input and display the output respectively 
initialize object of this class acess the class method impliment of this senerio in java */


import java.util.Scanner;
public class StudentData{
           
          String name;
          int age;
          float cgpa;
           void getdata(){
          Scanner sc=new Scanner(System.in);
   System.out.println("Get   Student Data : ");
             System.out.print("Enter The Student  Name  : ");
              name=sc.next();
             System.out.print("Enter Student  Age: ");
              age=sc.nextInt();
             System.out.print("Enter The Student CGPA : ");
            cgpa=sc.nextFloat();
   }
           void showdata(){
   System.out.println("");
         System.out.println("Show  Student Data : ");
       System.out.println("Student Name : "+name);
        System.out.println("Student Age: "+age);
         System.out.println("Student CGPA: "+cgpa);
}
           public static void main(String a[]){
           StudentData obj =new StudentData();
            obj.getdata();
            obj.showdata();
      
         }
}