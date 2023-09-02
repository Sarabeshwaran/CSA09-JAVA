import java.io.*;
import java.util.*;
class employee1
{
String Enam;
int Enum,Ba,Hra,Ta,Da,Ns,Pf,Lic,Dec,Gs;
public void calculate()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter your Name :");
Enam=sc.nextLine();
System.out.print("Enter your Enum :");
Enum=sc.nextInt();
System.out.print("Enter your Basic Salary :");
Ba=sc.nextInt();

Hra=Ba*10/100;
Ta=Ba*20/100;
Da=Ba*15/100;
Pf=Ba*12/100;
Lic=Ba*20/100;
Ns=Ba+Hra+Ta+Da;
Dec=Pf+Lic;
Gs=Ns-Dec;
}
public void output()
{
System.out.print("The Basic pay :"+Ba+"\nThe Net Salary :"+Ns+"\nThe Dec :"+Dec+"\nGross Salary :"+Gs);
}
}

class employee
{
public static void main(String[] args)
{
employee1 A=new employee1();
A.calculate();
A.output();
}
}
