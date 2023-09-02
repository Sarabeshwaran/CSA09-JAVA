import java.io.*;
import java.util.*;
class binary
{
public static void main(String[] args)
{
long b;
int oct=0,dec=0,i=0,temp,r;
String hex=" ";
char hexarr[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
Scanner sc=new Scanner(System.in);
System.out.print("Enter the numbe binary :");
b=sc.nextInt();
while(b!=0)
{
dec+=(b%10)*Math.pow(2,i);
++i;
b/=10;
}
temp=dec;
System.out.println("The Decimal :"+dec);
i=1;
while(dec!=0)
{
oct+=(dec%8)*i;
dec/=8;
i*=10;
}
dec=temp;
System.out.println("The Octal :"+oct);
while(dec!=0)
{
r=dec%16;
hex=hexarr[r]+hex;
dec=dec/16;
}
System.out.println("The Hexadecimal :"+hex);
}
}
