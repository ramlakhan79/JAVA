/* Aim: Define a class Compute with overloaded methods [void add(), int add(int, int) and double 
add (double, double, double)]. Implement this in JAVA.
 */

import java.util.*;
class MethodOverload {
public void add() {
Scanner sc = new Scanner(System.in);
int n1 = 0, n2 = 0, n3 = 0, sum = 0;
System.out.println("Enter 3 Integers : ");
n1 = sc.nextInt();
n2 = sc.nextInt();
n3 = sc.nextInt();
sum = n1 + n2 + n3;
System.out.println("SUM of 3 Numbers by Overloaded Method 1 is : " + sum); }
public void add(int x, int y) {
int temp = x + y;
System.out.println("SUM of 3 Numbers by Overloaded Method 2 is : " + temp); }
public void add(double a, double b, double c) {
double temp = a + b + c;
System.out.println("SUM of 3 Numbers by Overloaded Method 3 is : " + temp); }
public static void main(String[] args) {
int arg1 = 0, arg2 = 0;
double par1 = 0.0, par2 = 0.0, par3 = 0.0;
Scanner scmain = new Scanner(System.in);
System.out.println("Enter 2 Integers : ");
arg1 = scmain.nextInt();
arg2 = scmain.nextInt();
System.out.println("Enter 3 Floating Point Numbers : ");
par1 = scmain.nextDouble();
par2 = scmain.nextDouble();
par3 = scmain.nextDouble();
MethodOverload obj = new MethodOverload();
obj.add();
obj.add(arg1, arg2);
obj.add(par1, par2, par3);
} }
