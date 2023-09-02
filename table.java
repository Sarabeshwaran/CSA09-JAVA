import java.io.*;
import java.util.*;
class table
{
public static void main(String[] args)
{
int n,r;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=1;i<=10;i++)
{
r=i*n;
System.out.println(i+"x"+n+"="+r);
}
}
}