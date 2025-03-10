import java.lang.*;
import java.util.*;
class CountObject{
public static int cnt;
public int object(){
cnt++;
return cnt;
}
public static void main(String args[]){
CountObject n1=new CountObject();
CountObject n2=new CountObject();
CountObject n3=new CountObject();
System.out.println(n1.object());
System.out.println(n2.object());
System.out.println(n3.object());
}
}