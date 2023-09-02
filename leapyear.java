import java.io.*;
import java.util.Scanner;
class leapyear
{
public static void main(String[] args)
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the year :");
a=sc.nextInt();
if(a%4==0 && a%100!=0 || a%400==0)
{
System.out.println("This is leap year");
}
else
{
System.out.println("This is not a leap year");
for(int i=0;i<=4;i++)
{
a+=1;
if(a%4==0 && a%100!=0 || a%400==0)
{
System.out.println("The next leap year "+a);
break;
}
}
}
}
}