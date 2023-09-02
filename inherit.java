import java.io.*;
import java.util.*;

class inherit
{
public static void main(String[] args)
{
child c=new child();
c.display();
c.display1();
}
}

class a
{
int d=10;
void display()
{
System.out.println("10");
}
}

interface b
{
void display1();
}

class child extends a implements b
{
public void display1()
{
System.out.println("5");
}
}