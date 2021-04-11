import java.util.*;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int ce=0,co=0;
        int n = sc.nextInt();
        int t1 = 0, t2 = 1;
        if(!(n>5 && n<=20)){   System.out.println("Invalid input");}
        

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t2 + " ");
            if(t2%2==0){ce++;} else {co++;} 
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println();
        System.out.println(ce);
        System.out.println(co);
        
    }
}