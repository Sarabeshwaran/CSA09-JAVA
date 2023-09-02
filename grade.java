import java.io.*;
import java.util.Scanner;
class grade
{
public static void main(String[] args)
{
double A,B,C,D,F,Reg;
double AVRAGE;
String Na;

Scanner na=new Scanner(System.in);
System.out.println("Enter your Name :");
Na=na.nextLine();

Scanner reg=new Scanner(System.in);
System.out.println("Enter Your Register Number :");
Reg=reg.nextInt();

Scanner a=new Scanner(System.in);
System.out.println("Enter Your 1st mark :");
A=a.nextInt();

Scanner b=new Scanner(System.in);
System.out.println("Enter Your 2nd mark :");
B=b.nextInt();

Scanner c=new Scanner(System.in);
System.out.println("Enter Your 3rd mark :");
C=c.nextInt();

Scanner d=new Scanner(System.in);
System.out.println("Enter Your 4th mark :");
D=d.nextInt();

Scanner f=new Scanner(System.in);
System.out.println("Enter Your 5th mark :");
F=f.nextInt();

if(A>50 && B>50 && C>50 && D>50 && F>50)
{
AVRAGE =(A+B+C+D+F)/5;
System.out.println("Average :"+AVRAGE);
if( AVRAGE >90)
{
System.out.println("Grade : S");
}
else if(AVRAGE >=81 && AVRAGE <=90)
{
System.out.println("Grade : A");
}
else if(AVRAGE >=71 && AVRAGE<=80)
{
System.out.println("Grade : B");
}
else if(AVRAGE >=61 && AVRAGE<=70)
{
System.out.println("Grade : C");
}
else
{
System.out.println("Grade : D");
}

}
else
{
System.out.println("You had failed in subject");
}
}
}