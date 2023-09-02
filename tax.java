import java.io.*;
import java.util.Scanner;
class tax
{
public static void main(String[] args)
{
double A,B;
Scanner a=new Scanner(System.in);
System.out.println("Enter your Annual Income :");
A=a.nextInt();
if(A<=150000)
{
System.out.println("You have No Tax");
}
else if(A>150000 && A<=300000)
{
B=A*10/100;
System.out.println("Your Tax :"+B);
}
else if(A>300000 && A<=500000)
{
B=A*20/100;
System.out.println("Your Tax :"+B);
}
/**else if(A>300000 && A<=500000)
{
B=A*30/100;
System.out.println("Your Tax :"+B);
}**/
else
{
B=A*30/100;
System.out.println("Your Tax :"+B);
}
}
}