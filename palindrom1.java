import java.io.*;
import java.util.*;

class palindrom1
{
public static void main(String[] args)
{
int n,d,s=0,S,a=0,N;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number :");
n=sc.nextInt();
S=n;
while(n>0)
{
d=n%10;
s=s*10+d;
n/=10;
}
n=s+S;
N=n;
d=0;
while(n>0)
{
d=n%10;
a=a*10+d;
n/=10;
}
if(a==N)
{
System.out.println("Given number is palindrom");
}
else
{
System.out.println("Given number is not a palindrom");
}
}
}