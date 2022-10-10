
import java.util.Scanner;
public class Addit{
    int n1,n2;
    public static void main(String args[]) {
        Addit obj=new Addit();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers : ");
       
        obj.n1=sc.nextInt();
       
        obj.n2 = sc.nextInt();
        
        System.out.println("Addition of two number is : "+(obj.n1+obj.n2));
            

  }
}