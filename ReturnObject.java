import java.lang.*;
import java.util.*;
class ReturnObject{
public int num;
ReturnObject(){
num=5;
}
public ReturnObject object(ReturnObject obj){
obj.num=obj.num+5;
return obj;
}
public static void main(String args[]){
ReturnObject o1=new ReturnObject();
ReturnObject o2=new ReturnObject();
ReturnObject o3=new ReturnObject();
o3=o1.object(o2);
System.out.println(o3.num);

}
}
