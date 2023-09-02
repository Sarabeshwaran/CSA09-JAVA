import java.io.*;
import java.util.Scanner;
class temperature
{
public static void main(String[] args)
{
double f,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Fehrenheit :");
f=sc.nextFloat();
c=(f-32)/1.8;
System.out.println("The Temperature in Celsius :"+c);
}
}