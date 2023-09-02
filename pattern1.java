import java.io.*;
import java.util.*;
class pattern1
{
public static void main(String[] args)
{
int i,j,S,n;
String A="9";
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Number Row :");
n=sc.nextInt();
for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(A+"  ");
}
A=A+9;
System.out.println();
}
}
}