import java.io.*;
import java.util.*;

class factor
{
public static void main(String[] args)
{
int b,c,j=0,i;
int[] a =new int[20];
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number :");
b=sc.nextInt();
System.out.println("Enter The Nth number :");
c=sc.nextInt();
for(i=1;i<=b;i++)
{
if(b%i==0)
{
a[j]=i;
j++;
}
}

for(i=0;i<j;i++)
{
System.out.print(a[i]+" ");
}

System.out.print("\nThe Nth factor ="+a[c-1]);
}
}