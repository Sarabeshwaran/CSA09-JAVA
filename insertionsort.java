import java.io.*;
import java.util.Scanner;

class insertionsort
{
public static void main(String args[])
{
int arr[]=new int[20];
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the No of Elements in array: ");
n=sc.nextInt();
System.out.println("Enter the Elements in array: ");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("The Given Array:");
for(int i=0;i<n;i++)
{
System.out.println(arr[i]+" ");
}
for(int j=1;j<n;j++)
{
int current=arr[j];
int k=j-1;
while(k>=0 && arr[k]>current)
{
arr[k+1]=arr[k];
k--;
}
arr[k+1]=current;
}
System.out.println("The Insertion Sort:");
for(int l=0;l<n;l++)
{
System.out.println(arr[l]+" ");
}
}
}
