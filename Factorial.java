import java.lang.*;
import java.util.*;
class Factorial{
public int fact(int n){
int f=1;
for(int i=1;i<=n;i++){
f=f*i;
}
return (f);
}
public static void main(String args[]){
Factorial fac=new Factorial();
System.out.println("Enter a Number :");
Scanner sc=new Scanner(System.in);
int k=sc.nextInt();
System.out.println(fac.fact(k));
}}