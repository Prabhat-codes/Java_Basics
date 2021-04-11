import java.lang.Math; 
class InvalidPythagoreanTripletException extends Exception{
int a,b,c;
InvalidPythagoreanTripletException(int c,int d,int e){
a = c;
b = d;
c = e;
}
public String toString(){
return a+","+b+","+c+"are not pythagorean triplets";}
}
class Checker{
 static void checkPT(int a,int b,int c) throws InvalidPythagoreanTripletException{
// a should be the largest number
if(Math.pow(a,2) == Math.pow(b,2) + Math.pow(c,2)){
System.out.println(a+","+b+","+c+"are pythagorean triplets");
}else{
throw new InvalidPythagoreanTripletException(a,b,c);
}
}
}
class Demo{
public static void main(String args[]){
try{try{
Checker.checkPT(5,3,2); 
}catch(InvalidPythagoreanTripletException e){
System.out.println(e);
throw e;
}}catch(InvalidPythagoreanTripletException e1){
System.out.println(e1 + " Caught rethrown exception");
}
}
}