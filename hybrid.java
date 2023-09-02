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
void disp1()
{
System.out.println("10");
}
}

interface d
{
public void disp2();
}

class c extends b implements d
{
public void disp2()
{
System.out.println("15");
}

void disp3()
{
System.out.println("20");
}
}

class hybrid
{
public static void main(String[] args)
{
c C=new c();
C.disp();
C.disp1();
C.disp2();
C.disp3();
}
}