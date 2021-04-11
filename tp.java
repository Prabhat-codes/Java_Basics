import java.util.*;

class Complex
{
	int a,b;
	Complex()
	{
		a=0;
		b=0;
	}
	Complex(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public void display(){
		System.out.println("Complex number is :"+a+"+ i"+b);
	}
	public void add(int a1,int a2,int b1,int b2){
		int c=a1+a2;
		int d=b1+b2;
		System.out.println("Complex number after addition is :"+c+" "+d+"i");
	}
	public static void main(String args[]){
		System.out.println("Enter values of a and b");
		Scanner sc=new Scanner(System.in);
		int real=sc.nextInt();
		int complex=sc.nextInt();
		int a3=sc.nextInt();
		int a4=sc.nextInt();
		int b3=sc.nextInt();
		int b4=sc.nextInt();
		Complex abc=new Complex();
		Complex bcd=new Complex(5,6);
		bcd.display();
		abc.display();
		abc.add(a3,a4,b3,b4);
		bcd.add(a3,a4,b3,b4);
		// abc.add(a3,a,b3,b);
		// bcd.add(a3,a,b3,b);
	}	
}