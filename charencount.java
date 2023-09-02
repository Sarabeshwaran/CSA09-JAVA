import java.io.*;
import java.util.*;
class charencount
{
public static void main(String args[])
{
String n=" ",temp;
int npo=0,nne=0,num=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the character: ");
while(n!='*')
{
n=sc.nextLine();
if(n>="A" && n<="Z")
{
npo+=1;
}
else if (n>="a" && n<="z")
{
nne+=1;
}
else
{
num+=1;
}
}
System.out.println("Number of Upper Case: "+npo);
System.out.println("Number of Lower Case: "+nne);
System.out.println("Number of number: "+num);
}
}


