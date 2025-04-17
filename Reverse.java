import java.lang.*;
import java.util.*;
class Reverse{
public static void main(String args[]){
String original="MananMeratwal";
String reverse=" ";
for(int i=0;i<original.length();i++){
reverse=original.charAt(i)+reverse;
}
System.out.println(reverse);
}
}