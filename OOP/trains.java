import java.util.*;
class trains {
    public static void main(){
       Scanner sc=new Scanner(System.in);
       String[] RS= {"PANVEL","KHANDESHWAR","MANSAROVAR","KHARGHAR","BELAPUR","SEAWOOD","NERUL"};
       int[] T={0,4,5,3,4,5,3};
       double[] Ti=new double[7];
       for(int i=0;i<7;i++){
           System.out.print(RS[i]+" ");
           Ti[i]=((double)T[i])/10;
       }
       int n,d;
       double[] Trains={7.30,8.2,12.45,13.30,14.44,15.50,9.15,10.20,23.59,17.33,19.20};
       System.out.println(" ");
       System.out.println(" Enter time rn");
       double time=sc.nextDouble();
       
       System.out.println("At which station are you right now? ");
       String s=sc.nextLine();
       for(int i=0;i<7;i++){
           if(RS[i]==s){
               d=i;
       }
    }
    
       
    
    
    }
}