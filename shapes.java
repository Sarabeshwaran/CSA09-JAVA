import java.io.*;
import java.util.*;

class rectangle
{
double l,b,h;
public void rec()
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter Length :");
l=sc.nextInt();
System.out.println("Enter Breath :");
b=sc.nextInt();
System.out.println("Enter height :");
h=sc.nextInt();
}
}

interface shape
{
public void shap();
}

class quboid extends rectangle implements shape
{
int B;
double C,D;

public void result()
{
C = l+b+B;
D = l*b*h;
System.out.println("Area:"+C);
System.out.println("Volume :"+D);
}

public void shap()
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the sides :");
B=sc.nextInt();
}

}

class shapes
{
public static void main(String[] args)
{
quboid a =new quboid();
a.rec();
a.shap();
a.result();
}
}