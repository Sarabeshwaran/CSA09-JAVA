import java.io.*;
import java.util.*;
class deposit
{
public static void main(String[] args)
{

int x,xn=0,y,yn=0,z,zn=0,t,tn=0,to,n;
Scanner a=new Scanner(System.in);
System.out.print("Enter The denominatio :");
x=a.nextInt();
if(x==2000 || x==500|| x==200 || x==100)
{
System.out.print("Enter The number of"+x+"notes :");
xn=a.nextInt();
}
else
{
System.out.println("Invaild Denomination");
}

System.out.print("Enter The 2nd denominatio :");
y=a.nextInt();
if(y==2000 || y==500|| y==200 || y==100)
{
System.out.print("Enter The number of"+y+"notes :");
yn=a.nextInt();
}
else
{
System.out.println("Invaild Denomination");
}

System.out.print("Enter The 3rd denominatio :");
z=a.nextInt();
if(z==2000 || z==500|| z==200 || z==100)
{
System.out.print("Enter The number of"+z+"notes :");
zn=a.nextInt();
}
else
{
System.out.println("Invaild Denomination");
}

System.out.print("Enter The 4th denominatio :");
t=a.nextInt();
if(t==2000 || t==500|| t==200 || t==100)
{
System.out.print("Enter The number of"+t+"notes :");
tn=a.nextInt();
}
else
{
System.out.println("Invaild Denomination");
}

n=xn+yn+zn+tn;
to=(xn*x)+(yn*y)+(zn*z)+(tn*t);
System.out.println("Number of notes :"+n);
System.out.println("Balance ="+to);
}
}