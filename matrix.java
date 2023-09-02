import java.io.*;
import java.util.*;
class matrix
{
public static void main(String[] args)
{
int[][] m1=new int[3][3];
int[][] m2=new int[3][3];
int[][] ans=new int[3][3];
int i,j,k,s,a;
Scanner sc=new Scanner(System.in);

System.out.println("Enter The 1st matrix :");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
m1[i][j]=sc.nextInt();
}
}

System.out.println("Enter the 2nd matrix :");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
m2[i][j]=sc.nextInt();
}
}

System.out.print("Operation to perform :"+"\nAdd(1),Sub(2),Multi(3),Trans(4),Sum of diognals(5)"+"\n");
s=sc.nextInt();

switch(s)
{
case 1://addition
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	ans[i][j]=m1[i][j]+m2[i][j];
	}
	}
	System.out.println("The Addition of Mtrix");
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	System.out.print(ans[i][j]+" ");
	}
	System.out.println();
	}
	break;
case 2://Sub
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	ans[i][j]=m1[i][j]-m2[i][j];
	}
	}
	System.out.println("The Subtraction of Mtrix");
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	System.out.print(ans[i][j]+" ");
	}
	System.out.println();
	}
	break;
case 3://Multiplication
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	ans[i][j]=0;
	for(k=0;k<3;k++)
	{
	ans[i][j]+=m1[i][k]*m2[k][j];
	}
	}
	}
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	System.out.print(ans[i][j]+" ");
	}
	System.out.println();
	}
	break;
case 4://Transpose
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	ans[i][j]=m1[j][i];
	}
	}
	for(i=0;i<3;i++)
	{
	for(j=0;j<3;j++)
	{
	System.out.print(ans[i][j]+" ");
	}
	System.out.println();
	}
	break;
case 5://Sum of Diagonals
	a=m1[0][0]+m1[1][1]+m1[2][2];
	System.out.println("Sum of Diagonals(A) :"+a);
	break;
}
}
}
