import java.io.*;
import java.util.Scanner;
class circle
{
public static void main(String[] args)
{
double a,A,C;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Radius of circle :");
a=sc.nextFloat();
A=3.14*a*a;
C=2*3.14*a;
System.out.println("Area of Circle is "+A+"\nCircumference of the circle is "+C);
}
}