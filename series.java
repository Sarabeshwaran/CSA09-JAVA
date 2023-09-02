import java.io.*;
import java.util.*;
class series
{
public static void main(String[] args)
{
int n,i,j,Exp1=1,Exp2=1;
double sum1=0,sum2=0,Ans;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the N value :");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
if(i%2==0)
{
for(j=1;j<=i;j++)
{
Exp1=Exp1*j;
}
sum1 +=i/Exp1;
}
else
{
for(j=1;j<=i;j++)
{
Exp2=Exp2*j;
}
sum2 +=i/Exp2;
}
}
Ans=sum1-sum2;
System.out.println("The value :"+sum1+sum2);
}
}