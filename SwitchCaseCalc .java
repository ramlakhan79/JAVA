/*  Aim: Write a program in JAVA to implement simple arithmetic calculator using SWITCH 
CASE. */


import java.util.*;
class SwitchCaseCalc {
public static void main(String[] args) {
int x = 0, y = 0, c = 0;
Scanner scan = new Scanner(System.in);
System.out.println("Enter 2 Numbers : ");
x = scan.nextInt(); y = scan.nextInt();
System.out.println("\n 1 for ADD \n 2 for SUB \n 3 for MUL \n 4 for DIV \n 5 for MOD");
System.out.println("Enter your Choice : ");
c = scan.nextInt();
switch(c) {
case 1: { int r = x + y; System.out.println("SUM is : " + r); break; }
case 2: { int r = x - y; System.out.println("DIFFERENCE is : " + r); break; }
case 3: { int r = x * y; System.out.println("PRODUCT is : " + r); break; }
case 4: { float r = (float) x / y; System.out.println("DIVISION is : " + r); break; }
case 5: { int r = x % y; System.out.println("REMAINDER is : " + r); break; }
default:
System.out.println("INVALID CHOICE \n PLEASE SELECT A VALID OPERATION");
}
} }
