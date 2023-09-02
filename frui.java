import java.io.*;
import java.util.*;

class apple
{
int A;
public void app()
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the number of apples :");
A=sc.nextInt();
}
}

interface mango
{
public void mang();
}

class fruit extends apple implements mango
{
int B,C;

public void fru()
{
C = A+B ;
System.out.println("The number Apple :"+A);
System.out.println("The number Mango :"+B);
System.out.println("Total number of fruits :"+C);
}

public void mang()
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the number of Mango :");
B=sc.nextInt();
}

}

class frui
{
public static void main(String[] args)
{
fruit a =new fruit();
a.app();
a.mang();
a.fru();
}
}
