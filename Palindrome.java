import java.lang.*;
import java.util.*;
class Palindrome{
public int palindrome(String s1){
int i=0;
int j=s1.length()-1;
while(i<j){
if(s1.charAt(i)!=s1.charAt(j)){
return 0;
}
i++;
j--;
}
return 1;
}
public static void main(String args[]){
Palindrome ch=new Palindrome();


System.out.println("enter a stirng");
Scanner sc=new Scanner(System.in);
String k=sc.nextLine();
int ch1=ch.palindrome(k);
if(ch1==1)
System.out.println("palindrome");
else
System.out.println("not Palindrome");
}
}

