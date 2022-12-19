 /* Define a class base with member void show method .Define a subclass child that is subclass inherit
 the property of base class. Child  modifies the definition of show method. proove that for derived 
 method show two different definitions exist in both the class. Implement this program java .
*/
 class Base 
 {
    void show()
    {
        System.out.println("Base Class");
    }
}
public class Child extends Base{
    void show(){
        System.out.println("Child Class");
    }
public static void main(String arg[])    {
     Base b;
    Base obj=new Base();
    Child obj1=new Child();
       b=obj;
       b.show();
       b=obj1;
       b.show();
}
}
