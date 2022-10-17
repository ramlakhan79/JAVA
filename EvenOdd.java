import java.util.Scanner;
class EvenOdd{
    public static void main(String a[] ){
        Scanner sc =new Scanner(System.in);
           int n;
         System.out.println("Enter The Number ");
            n=sc.nextInt();
        if(n%n==0){
            System.out.println("Number is Even  ");
        }
        else{
            System.out.println("Number is Odd ");            
        }
    }
}