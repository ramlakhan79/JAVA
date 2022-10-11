import java.lang.String;
import java.util.Scanner;
public class Book{
           int Book_no;
           String Book_title="";
       float Book_price;
            void input(){ 
               Scanner b=new Scanner(System.in);
                 System.out.print("Enter the Book No : ");
                  Book_no=b.nextInt();
                  System.out.print("Enter the Book Title :");
                  Book_title=b.next();
                  System.out.print("Enter the Book Price :");
                   Book_price=b.nextFloat();
                    total_cost();
               }
            void total_cost(){
                 
                 System.out.println("The Book No  :"+Book_no);
                 System.out.println("The Book Title :"+Book_title);
                 System.out.println("The Book Price :"+Book_price);
               }
public static void main(String a[]){
      
            Book f =new Book();
              f.input();
   }
}