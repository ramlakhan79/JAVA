/* Aim: Write a program in JAVA to compute average of 3 numbers and perform necessary type 
casting. */

class TypeCastCommandLine
{
public static void main(String[] args)
{
int a = 0, b = 0, c = 0, s = 0;
double avg = 0.0;
a = Integer.parseInt(args[0]); // Type Casting – String is converted to INT
b = Integer.parseInt(args[1]); // Type Casting – String is converted to INT
c = Integer.parseInt(args[2]); // Type Casting – String is converted to INT
s = a + b + c;
avg = s / 3.0;
// Type Casting – Taking DOUBLE Denominator to get DOUBLE Result
System.out.println(“Average of Three Numbers is : ” + avg);
}
}

