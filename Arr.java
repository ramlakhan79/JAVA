import java.util.Scanner;
public class Arr {
    public static void main(String arg[]){
        int x[]=new int[10];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<10;i++){
             x[i]=sc.nextInt();
        }
        for(int i=10;i>0;i--){
            System.out.print(x[i]+"\n");
        }
    }
}
