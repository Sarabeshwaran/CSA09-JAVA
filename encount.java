import java.io.*;
import java.util.*;
class encount
{
public static void main(String args[])
{
double a,an,ap;
double n=0,ne=0,nne=0,po=0,npo=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
while(n!=-1)
{
n=sc.nextInt();
if(n>0)
{
po=po+n;
npo+=1;
}
else
{
ne=ne+n;
nne+=1;
}
}
an=ne/nne;
ap=po/npo;
System.out.println("Average of positive number: "+ap);
System.out.println("Average of negitive number: "+an);
}
}


