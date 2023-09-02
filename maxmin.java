import java.io.*;
import java.util.*;
class maxmin
{
public static void main(String[] args)
{
int[] arr=new int[10];
int i,j,tem=0,max,min,n,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of array :");
for(i=0;i<10;i++)
{
arr[i]=sc.nextInt();
}
max=arr[0];
min=arr[0];
for(j=0;j<10;j++)
{
n=arr[j];
if(n>max)
{
max=n;
}
if(n<min)
{
min=n;
}
}
c=max-min;
System.out.println(max);
System.out.println(min);
System.out.println("the diference = "+c);
}
}
