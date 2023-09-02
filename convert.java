import java.io.*;
import java.util.*;
class convert
{
public static void main(String args[])
{
int[] arr=new int[10];
int[] arr1=new int[10];
int i,j,k,n,flag=0,temp=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the decimal number:");
n=sc.nextInt();
temp=n;
if(n>0)
{
flag=1;
}
if(flag==1)
{

for(i=0;n>0;i++)
{
arr[i]=n%2;
n=n/2;
}
System.out.print("Binary number= ");
for(i=i-1;i>=0;i--)
{
System.out.print(arr[i]);
}
n=temp;
for(j=0;n>0;j++)
{
arr1[j]=n%8;
n=n/8;
}
System.out.print("\nOctal number= ");
for(j=j-1;j>=0;j--)
{
System.out.print(arr1[j]);
}
}
else
{
System.out.println("Enter  valid number!");
}


}
}


