import java.lang.*;
import java.util.*;
class SwapObject{
public int num1,num2;
SwapObject(){
num1=5;
num2=6;
}
public SwapObject object(SwapObject obj){
int t;
t=obj.num1;
obj.num1=obj.num2;
obj.num2=t;

return obj;
}
public static void main(String args[]){
SwapObject o1=new SwapObject();
SwapObject o2=new SwapObject();
SwapObject o3=new SwapObject();
o3=o1.object(o2);
System.out.println("Number 1 is"+o3.num1);
System.out.println("Numnber 2 is"+o3.num2);

}
}
