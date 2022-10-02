public class Fibonacci{
    void Fibonacci(){
        int i,first=0,second=1,next,temp;
        for(i=0;i<=5;i++){
            
            next=first+second;
    
        System.out.print(first + ", ");

        temp=first;
        first=second;
        second=next;
        
        }
        
    }
    public static void main(String args[]) {
     
    Fibonacci obj=new Fibonacci();
    obj.Fibonacci();
    }
}