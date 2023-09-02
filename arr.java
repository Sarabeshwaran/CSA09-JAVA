import java.util.*;
import java.io.*;
class arr
{
public static void main(String[] args)
{
int[] A=new int[6];
int i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the vale of Array :");
for(i=0;i<=5;i++)
{
A[i]=sc.nextInt();
}
System.out.println("     "+Arrays.toString(A));
Arrays.sort(A);
System.out.println(Arrays.toString(A));
StringBuffer sbf = new StringBuffer(Arrays.toString(A));
sbf.reverse();
System.out.println("String buffer after reversing = " + sbf);
}
}
