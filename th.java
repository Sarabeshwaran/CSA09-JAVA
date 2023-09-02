import java.io.*;
import java.util.*;
import java.util.concurrent.*;

class A extends Thread
{
public void run()
{
int i;
for(i=0;i<=5;i++)
{
System.out.println(i);
}
}
}

class B extends Thread
{
public void run()
{
int j;
for(j=0;j<=5;j++)
{
if(j==3)
{
Thread.sleep(500);
}
else
{
System.out.println(j);
}
}
}
}

class C extends Thread
{
public void run()
{
int k;
for(k=0;k<=5;k++)
{
System.out.println(k);
}
}
}

class th
{
public static void main(String[] args)
{
new A().start();
new B().start();
new C().start();
}
}