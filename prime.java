import java.io.*;
import java.util.*;
class prime
{
public static void main(String[] args)
{
int[] arr=new int[10];
int i,c,j,n,f=0,Com=0,prim=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of array :");
for(i=0;i<10;i++)
{
arr[i]=sc.nextInt();
}

for(i=0;i<10;i++)
{
n=arr[i];
c=n/2;
for(j=2;j<=c;j++)
{
if(n%j==0)
{
f=1;
}
}
if(f==1)
{
Com+=1;
}
else
{
prim+=1;
}
f=0;
}
System.out.print("Number of Prime :"+prim);
System.out.print("\nNumber of Composit :"+Com);
}
}