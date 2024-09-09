class Exception1{
 public static void main(String args[]) {
try{
int x=100/0;
}catch(ArithmeticException e){
System.out.println(e);
}
finally{
System.out.println("This code always execute");
}
}
}