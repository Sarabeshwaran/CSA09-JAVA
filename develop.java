import java.io.*;
import java.util.*;

class develop
{
public static void main(String[] args)
{
String a, b = "john goasling";
int i;
Scanner sc = new Scanner(System.in);
for(i=0;i<3;i++)
{
System.out.println("How developed java :");
a = sc.nextLine();
if(a.equals(b))
{
System.out.println("Good");
break;
}
else
{
System.out.println("Try again");
}
}
}
}

