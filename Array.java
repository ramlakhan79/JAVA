import java.util.Scanner;
public class Array {
    public static void main(String arg[]){
        int x[]=new int[5];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<5;i++){
             x[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.print(x[i]+"\n");
        }
    }
}
