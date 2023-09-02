import java.io.*;
import java.util.*;
class pernum
{
public static void main(String[] args)
{
int n,s=0,i=1;
int[] a=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number :");
n=sc.nextInt();
while(i<n)
{
if(n%i==0)
s=s+i;
i++;
}
if(s==n)
{
System.out.println("Ented number is perfect number");
}
else
{
System.out.println("Entered number is not perfect number");
}
}
}
