 


public class ZeroAbsoluteValueException extends Exception{
   String str1;
   ZeroAbsoluteValueException(String str2) {
	str1=str2;
   }
   public String toString(){ 
	return ("ZeroAbsoluteValueException Occurred: "+str1) ;
   }
}

package MyComplexNumber;



public class Test{
	double a,b,z;
	public Test(double c, double d){
		a=c;
		b=d;
	}
	public void display(){
		System.out.println(a+"+ i"+b);
	}
	public void absoluteOfComplex() throws ZeroAbsoluteValueException{
		z = Math.sqrt(a*a+b*b);
		System.out.println("Absolute value: "+z);
		if(z==0){
			throw new ZeroAbsoluteValueException("Absolute value zero");
		}
	}
}




import MyComplexNumber.*;


class complexdemo{
	public static void main(String args[]){
		try{
			Test obj = new Test(2,2);
			obj.absoluteOfComplex();
			obj.display();
		}
		catch (ZeroAbsoluteValueException exp){
			System.out.println(exp);
		}
	}
}