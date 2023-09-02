import java.io.*;
import java.util.Scanner;
class address
{
public static void main(String[] args)
{
String N,FN,DN,SN,AN,C,P;

Scanner a=new Scanner(System.in);
System.out.println("Enter your Name :");
N=a.nextLine();

Scanner b=new Scanner(System.in);
System.out.println("Enter your Father Name :");
FN=b.nextLine();

Scanner c=new Scanner(System.in);
System.out.println("Enter your DNo :");
DN=c.nextLine();

Scanner d=new Scanner(System.in);
System.out.println("Enter your Street Name :");
SN=d.nextLine();

Scanner e=new Scanner(System.in);
System.out.println("Enter your Area Name :");
AN=e.nextLine();

Scanner f=new Scanner(System.in);
System.out.println("Enter your City Name :");
C=f.nextLine();

Scanner g=new Scanner(System.in);
System.out.println("Enter your PinCode :");
P=g.nextLine();

System.out.println("Name :"+N+"\nFather Name :"+FN+"\nDoor Number :"+DN+"\nStreet Name :"+SN+"\nArea Name :"+AN+"\nCity :"+C+"\nPinCode :"+P);
}
}