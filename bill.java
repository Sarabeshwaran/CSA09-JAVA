import java.io.*;
import java.util.Scanner;
class bill
{
public static void main(String[] args)
{
int S;
double A,L,C,D,B;
String Na;

Scanner na=new Scanner(System.in);
System.out.println("Enter your Name :");
Na=na.nextLine();

Scanner s=new Scanner(System.in);
System.out.println("Domestic(1)/Industry(2):");
S=s.nextInt();

Scanner a=new Scanner(System.in);
System.out.println("Enter C-no :");
A=a.nextInt();

Scanner l=new Scanner(System.in);
System.out.println("Last month reading :");
L=l.nextInt();

Scanner c=new Scanner(System.in);
System.out.println("Current month reading :");
C=c.nextInt();
D=C-L;
switch(S)
{
case 1:
	if( D<=100)
	{
	System.out.println("No Bill");
	}
	else if(D>=101 && D <=200)
	{
	B=D*1;
	System.out.println("Your Bill "+B);
	}
	else if(D >=201 && D<=300)
	{
	B=D*2;
	System.out.println("Your Bill "+B);
	}
	else if(D >=301 && D<=500)
	{
	B=D*3.50;
	System.out.println("Your Bill "+B);
	}
	else
	{
	B=D*5;
	System.out.println("Your Bill "+B);
	}
	break;
case 2 :
	if( D<=100)
	{
	System.out.println("No Bill");
	}
	else if(D>=101 && D <=200)
	{
	B=D*1.25;
	System.out.println("Your Bill "+B);
	}
	else if(D >=201 && D<=300)
	{
	B=D*2.50;
	System.out.println("Your Bill "+B);
	}
	else if(D >=301 && D<=500)
	{
	B=D*4;
	System.out.println("Your Bill "+B);
	}
	else
	{
	B=D*5.40;
	System.out.println("Your Bill "+B);
	}
	break;
}
}
}




