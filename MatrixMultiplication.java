import java.util.Scanner;
class MatrixMultiplication 
{
    
    public static void main(String a[]) 
    { 
      int arr[][] = new int[2][2];
      int brr[][] = new int[2][2]; 
      int crr[][] = new int[2][2];
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Elements of first array : ");
        for(int i=0;i<2;i++) 
           {
                for(int j=0;j<2;j++)
                {
                   arr[i][j]=sc.nextInt();
                }
            }
        System.out.println("Enter the Elements of Second array : ");    
        for(int i=0;i<2;i++) 
           {
                for(int j=0;j<2;j++)
                {
                   brr[i][j]=sc.nextInt();
                }
            }
        for(int i=0;i<2;i++) 
           {
                for(int j=0;j<2;j++)
                {
                  crr[i][j]=0;
                    for(int k=0; k<2 ; k++)
                    {
                        crr[i][j]+=arr[i][k]*brr[k][j];
                    }  
                    System.out.println(crr[i][j]+" ");  
                }            
              System.out.println();   
           }   
               
    }       
}