import java.util.*;
class tp2{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n[]=new int[4];
		n=1[,2,3,4];
		for(int x:n){
			System.out.println("value of x"+x);
			n[x]=scanner.nextInt();
			System.out.println("NUmber accepted" + 	n[x]);
		}
		// for(int i=0;i<4;i++)
		// {
		// 	n[i]=scanner.nextInt();
		// }
		int sum=0;
		for(int i=0;i<n.length;i++){
			sum+=n[i];
			System.out.println("number being added" + n[i]);
		}
		System.out.println("average:"+(double)sum/4);
	}
}