import java.io.*;
import java.util.*;

class str
{
public static void main(String args[])
{
String a[]={"health is wealth","health","wealth","zero"};
int[] b=new int[3];
int temp=0,i,j;
System.out.println("Enter the number :");
Scanner sc=new Scanner(System.in);
for(i=0;i<3;i++)
{
b[i]=sc.nextInt();
}
for(j=0;j<3;j++)
{
temp=b[j];
if(temp%3==0 && temp%5==0)
{
System.out.println(a[0]);
}
else if(temp%3==0)
{
System.out.println(a[1]);
}
else if(temp%5==0)
{
System.out.println(a[2]);
}
else
{
System.out.println(a[3]);
}
}
}
}