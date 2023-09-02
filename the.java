import java.io.*;
import java.util.*;

class A extends Thread
{
public void run()
{
int i;
for(i=0;i<=5;i++)
{
System.out.print(i);
}
}
}

class B extends Thread
{
public void run()
{
int j;
for(j=0;j<=10;j++)
{
System.out.print(j);
}
}
}

class the
{
public static void main(String[] args)
{
new A().start();
B b=new B();
b.start();
b.setPriority(Thread.MAX_PRIORITY);
}
}