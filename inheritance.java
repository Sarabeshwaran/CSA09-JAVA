import java.io.*;
import java.util.*;

class staff()
{
string a;
void name()
{
scanner sc=new scanner(System.in);
System.out.println("Enter your name :");
a=sc.nextLine();
}
}

class teacher extends staff
{
string b;
void subject()
{
System.out.println("Enter your subject :");
b=sc.nextLine();
}
}

class typist() extends staff
{
int s;
void speed()
{
System.out.println("Enter your speed :");
s=sc.nextInt();
}
}

class officer() extends staff
{
string g;
void grade()
{
System.out.println("Enter your grade :");
g=sc.nextInt();
}
}

class () extends staff
{
string g;
void grade()
{
System.out.println("Enter your grade :");
g=sc.nextInt();
}
}