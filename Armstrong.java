import java.lang.*;
import java.util.*;
class Armstrong{
public static void main(String args[]){

int n1,n2,n3,n4=0,cnt=0,temp;
System.out.println("Enter Number:");
Scanner sc=new Scanner(System.in);
n1=sc.nextInt();
temp=n1;
while(temp>0){
temp=temp/10;
cnt++;
}
temp=n1;
while(temp>0){
n2=temp%10;
n3=(int) Math.pow(n2, cnt);
n4=n4+n3;
temp=temp/10;
}
System.out.println("Sum is  "+n4) ;
if(n4==n1)
System.out.println("Armstrong Number");
else
System.out.println("Not Armstrong Number");
}
}


