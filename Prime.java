import java.lang.*;
import java.util.*;
class Prime{
public void prime(int n){
boolean flag =true;
if(n<2){
System.out.println("not prime no.");
return;
}

for(int i=2;i<n;i++){
if(n%i==0){
flag=false;
break;  }
}
if(flag==true){
System.out.println("prime no.");}
else{
System.out.println("not prime no.");}

}
public static void main(String args[]){
Prime p=new Prime();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number:");
int k=sc.nextInt();
p.prime(k);
}
}