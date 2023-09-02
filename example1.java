import java.io.*;
import java.util.*;

class example1{
public static void main(String[] args){
int[] a=new int[10];
Scanner b=new Scanner(System.in);
System.out.println("Enter the Array value :");
int i,j,counter;
for(i=0;i<10;i++){
a[i]=b.nextInt();
}

System.out.println("the Prime:");
for(i=0;i<10;i++){
counter=0;
for(j=2;j<a[i];j++){
if(a[i]%j==0){
counter +=1;
}
}
if(counter == 0){
System.out.println(a[i]);
}
}
}
}