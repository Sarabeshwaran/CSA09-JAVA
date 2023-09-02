import java.io.*;
import java.util.*;
class palindrom
{
public static void main(String[] args)
{
int n,d,s=0,S,len,i;
String a,b=" ";
Scanner A=new Scanner(System.in);
System.out.println("Enter the number :");
n=A.nextInt();
System.out.println("enter the string:");
a=A.nextLine();
S=n;
while(n>0)
{
d=n%10;
s=s*10+d;
n/=10;
}
if(s==S)
{
System.out.println("Given number is palindrom");
}
else
{
System.out.println("Given number is not a palindrom");
}

len=a.length();
for(i=len-1;i>=0;i--)
{
b=b+a.charAt(i);
}
if(a.equals(b))
{
System.out.println("Given number is palindrom");
}
else
{
System.out.println("Given number is not a palindrom");
}
}
}