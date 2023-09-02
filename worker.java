import java.io.*;
import java.util.*;
class worker
{
public static void main(String args[])
{
String g;
double salary,n=0,total;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Grade: ");
g=sc.nextLine();
System.out.println("Enter your Salary: ");
salary = sc.nextInt();
switch(g)
{
case "A":
	if(salary>10000)
	{
	n=salary*0.05;
	}
	else
	{
	n=salary*0.07;
	}
	break;
case "B":
	if(salary>10000)
	{
	n=salary*0.10;
	}
	else
	{
	n=salary*0.12;
	}
	break;
}
total=salary+n;
System.out.println("Your Total Salary: "+total);
}
}

