import java.io.*;
import java.util.*;

public class Account1
{
public static void main(String args[])
{
Account Ac=new Account();
Ac.Balance(500);
}
}

public class Account
{
double B=0;
Account()
{
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
	break;
case 2:
	System.out.print("Enter the Amount to withdraw :");
	Wi=sc.nextInt();
	if(Wi<=B)
	{
	B=B-wi;
	}
	else
	{
	B=B-5;
	System.out.print("Your Withdraw amount is below to your balance so $5 had charged as penalty");
	}
	break;
}
}

public void Balance(int B)
{
System.out.print("The Balance :"+B);
}
}
