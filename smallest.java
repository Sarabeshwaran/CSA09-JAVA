import java.io.*;
import java.util.*;

class smallest{
public static void main(String[] args){
int[] arr=new int[5];
int i,a;
Scanner s=new Scanner(System.in);
System.out.println("Enter the Elements in Array :");
for(i=0;i<5;i++){
arr[i]=s.nextInt();
}
a=arr[0];
for(i=0;i<5;i++){
if(arr[i]<a){
a=arr[i];
}
}
System.out.println("The Smallest Number :"+a);
}
}