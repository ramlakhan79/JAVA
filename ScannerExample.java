/*  Aim: Write a program in JAVA to take 3 numbers as Input from User, compute Average and 
display the result. */

import java.util.Scanner;
class ScannerExample
{
public static void main(String[] args)
{
int a = 0, b = 0, c = 0, s = 0;
double avg = 0.0;
Scanner scan = new Scanner(System.in);
System.out.println("Enter Three Integers : ");
a = scan.nextInt();
b = scan.nextInt();
c = scan.nextInt();
s = a + b + c;
avg = s / 3.0;
System.out.println("Average of Three Numbers is : " + avg);
}
}
