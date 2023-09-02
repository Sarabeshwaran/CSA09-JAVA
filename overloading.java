import java.io.*;
import java.util.*;

class method
{
int area(int x)
{
return x*x;
}
float area(float y)
{
return y+y;
}
float area (int a, float b)
{
return a*b;
}
float area (float x, float y)
{
return x/y;
}
}

class overloading
{
public static void main(String[] args)
{
method m=new method();
System.out.println(m.area(10));
System.out.println(m.area(25.6f));

System.out.println(m.area(10,36.5f));
System.out.println(m.area(10.56f,36.5f));
}
}