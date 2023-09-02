import java.io.*;
import java.util.Scanner;
class vote
{
public static void main(String[] args)
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Age :");
a =sc.nextInt();
if(a>=18)
{
System.out.println("Your elegible");
}
else
{
System.out.println("Not elegible");
a=18-a;
System.out.println("Try after "+a+" years");
}
}
}
