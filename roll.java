import java.io.*;
import java.util.*;

class input
{
int[] a=new int[10];
int[] b=new int[10];
int[] c=new int[10];
int[] r=new int[10];
int i,j,k,l;
Scanner sc=new Scanner(System.in);
for(i=0;i<10;i++)
{
System.out.println("Enter student roll num :");
r[i]=sc.nextInt();
System.out.println("Enter subject 1 :");
a[i]=sc.nextInt();
System.out.println("Enter subject 2 :");
b[i]=sc.nextInt();
System.out.println("Enter subject 3 :");
c[i]=sc.nextInt();
}

int h1 = a[0]
int h2 = b[0]
int h3 = c[0]

for(j=0;j<10;j++)
{
if (a[j] < h1)
{
h1 = h1;
}
else
{
h1 = a[j];
}
}

for(k=0;k<10;k++)
{
if (b[k] < h2)
{
h2 = h2;
}
else
{
h2 = b[k];
}
}

for(l=0;l<10;l++)
{
if (c[l] < h3)
{
h3 = h3;
}
else
{
h3 = c[l];
}
}

System.out.println("The highest mark in Subject 1 :"+h1);
System.out.println("The highest mark in Subject 2 :"+h2);
System.out.println("The highest mark in Subject 3 :"+h3);
}
}