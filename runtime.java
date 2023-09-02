import java.io.*;
import java.util.*;

class a
{
void disp()
{
System.out.println("5");
}
}

class b extends a
{
void disp()
{
System.out.println("10");
}
}

class runtime
{
public static void main(String[] args)
{
b c=new b();
c.disp();
//a d=new a();
//d.disp();
}
}