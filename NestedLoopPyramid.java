/* Aim: Write a program in JAVA to display the „*‟ Pyramid of order „n‟ shown below:
                          *
                     *   *
                *   *   *
            *   *  *   *
      *   *   *   *   */

import java.util.*;
class NestedLoopPyramid
{
public static void main(String[] args)
{
int n = 0;
Scanner s = new Scanner(System.in);
System.out.println("Enter the Size of * Pyramid to display : ");
n = s.nextInt();
for(int i = 0; i < n; i++)
{
for(int j = 0; j < n; j++)
{
if((i + j) >= (n - 1))
System.out.print("*");
else
System.out.print(" ");
System.out.print(" ");
}
System.out.println();
}
}
}


