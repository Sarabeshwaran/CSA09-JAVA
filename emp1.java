import java.io.*;
import java.util.*;

class admin
{
String A;
public void ad()
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter your name :");
A=sc.nextLine();
}
}

interface account
{
public void acc();
}

class master extends admin implements account
{
int B;
double C,D;

public void bonus()
{
C = B*0.2;
D = B+C;
System.out.println("Name :"+A);
System.out.println("Salary :"+B);
System.out.println("Bonus :"+C);
System.out.println("Net Salary :"+D);
}

public void acc()
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter your Salary :");
B=sc.nextInt();
}

}

class emp1
{
public static void main(String[] args)
{
master a =new master();
a.ad();
a.acc();
a.bonus();
}
}