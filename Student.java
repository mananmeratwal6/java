import java.lang.*;
import java.util.*;
class Student{
public int id;
public String Name;
Student(int n,String m){
id=n;
Name=m;
}
public static void main(String args[])
{
Student s1=new Student(101,"Manan");
System.out.println(s1.id);
System.out.println(s1.Name);
}
}

