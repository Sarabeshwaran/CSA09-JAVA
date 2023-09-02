import java.io.*;
import java.util.*;

class triangle
{
float a,b,c,m,s;
public void right(float a, float b,float c)
{
if (a>b && a>c)
{
m=a;
s=b+c;
}
else if (b>a && b>c)
{
m=b;
s=a+c;
}
else
{
m=c;
c=a+b;
}

m=m*m;

if(m==s)
{
System.out.println("Right :True");
}
else
{
System.out.println("Right :false");
}
}

public void scalence(float a,float b,float c)
{
if ( a != b && a!=c && b != c)
{
System.out.println("scalence :True");
}
else
{
System.out.println("scalence :false");

}
}

public void iso(float a,float b,float c)
{
if ( a != b && a!=c && b != c)
{
System.out.println("iso :false");
}
else
{
System.out.println("iso :True");
}
}

public void equ(float a,float b,float c)
{
if ( a == b && a==c && b == c)
{
System.out.println("equali :True");
}
else
{
System.out.println("equali :false");
}
}
}

class triangle1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
float a,b,c,m,s;

System.out.println("Enter values of triangle :");

a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

triangle d=new triangle();
d.right(a,b,c);
d.scalence(a,b,c);
d.iso(a,b,c);
d.equ(a,b,c);
}
}
