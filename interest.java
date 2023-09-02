import java.io.*;
import java.util.Scanner;
class interest
{
public static void main(String[] args)
{
double A,B,C;
Scanner a=new Scanner(System.in);
System.out.println("Enter the princile Amount :");
A=a.nextInt();
Scanner b=new Scanner(System.in);
System.out.println("Enter the your Age :");
B=b.nextInt();
if(B>=60)
{
C=A*10/100;
System.out.println("Your interest amount :"+C);
}
else
{
C=A*12/100;
System.out.println("Your interest amount :"+C);
}
}
}