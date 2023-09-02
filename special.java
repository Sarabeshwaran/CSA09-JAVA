import java.io.*;
import java.util.*;
class special
{
public static void main(String args[])
{
String num;
char temp;
System.out.println("Enter the string: ");
Scanner sc=new Scanner(System.in);
num=sc.nextLine();
int len=num.length();
for(int i=0;i<len;i++)
{
temp=num.charAt(i);
if(temp=='!')
{
System.out.println("correct");
}
}
}
}

