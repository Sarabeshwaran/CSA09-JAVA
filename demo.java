import java.io.*;
import java.util.*;

class demo
{
public static void main( String[] args)
{
double d,m,y,w;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the number of days :");
d=sc.nextInt();
m= d/30;
y= d/365;
w= d/7;

System.out.println("No.of.Years :"+Math.round(y));
System.out.println("No.of.Month :"+m);
System.out.println("No.of.Weeks :"+w);
}
}