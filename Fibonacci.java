import java.lang.*;
import java.util.*;
class Fibonacci{
public static void main(String args[]){
int n,n1=0,n2=1,sum=0;
System.out.println("Enter number where you want to print the series");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=1;i<=n;i++){
sum=n1+n2;
n1=n2;
n2=sum;
System.out.println(n1);
}
}
}