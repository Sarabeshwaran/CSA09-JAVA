import java.io.*;
import java.util.Scanner;
class username
{
public static void main(String[] args)
{
String A,B;
Scanner a=new Scanner(System.in);
System.out.println("Enter the User Name :");
A=a.nextLine();
Scanner b=new Scanner(System.in);
System.out.println("Re-Enter the User Name :");
B=b.nextLine();
if(A.equals(B))
{
System.out.println(" The user name valid");
}
else
{
System.out.println("The user name Invalid");
}
}
}