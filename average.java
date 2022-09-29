
import java.util.Scanner;
public class Average {
    int n1,n2,n3;
    public static void main(String args[]) {
        Average obj=new Average();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers : ");
       
        obj.n1=sc.nextInt();
       
        obj.n2 = sc.nextInt();
        
        obj.n3 = sc.nextInt();
        System.out.println("Average of three number is : "+ (float) (obj.n1+obj.n2+obj.n3)/3);
            

  }
}