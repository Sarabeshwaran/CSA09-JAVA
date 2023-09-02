import java.io.*;
import java.util.*;

class 
{
public static void main(String args[])
{
System.out.println("hello");
Account Ac=new Account(500);
}
}
 class Account
{
double B=0;
Account(int x)
{
B=x;
int i;
double De,Wi;
Scanner sc=new Scanner(System.in);
System.out.print("Credit(1)/Debit(2) :");
i=sc.nextInt();
switch(i)
{
case 1:
	System.out.print("Enter the Amount to deposit :");
	De=sc.nextInt();
	B=B+De;
	System.out.print("The Balance :"+B);
	break;
case 2:
	System.out.print("Enter the Amount to withdraw :");
	Wi=sc.nextInt();
	if(Wi<=B)
	{
	B=B-Wi;
	System.out.print("The Balance :"+B);
	}
	else
	{
	B=B-5;
	System.out.print("The Balance :"+B);
	System.out.print("Your Withdraw amount is below to your balance so $5 had charged as penalty");
	}
	break;
}
}

}

