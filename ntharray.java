import java.io.*;
import java.util.*;
class ntharray
{
public static void main(String args[])
{
int[] arr=new int[100];
int[] arr1=new int[100];
int n,i,j;
System.out.println("Enter no of elements: ");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(j=0;j<n;j++)
{
for(k=0;k<j;k++)
{
if(arr[j]>arr[k])
{

