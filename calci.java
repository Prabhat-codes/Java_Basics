import java.util.*;
class calci
{
    public static void main()
    {
         Scanner s=new Scanner(System.in);
       System.out.println("Enter two numbers:");
       int first=s.nextInt();
       int second=s.nextInt();
       System.out.println("Enter the choice of operator: +,-,/,%");
       char operator=s.next().charAt(0);
       int result=0;
       
         
           switch(operator)
           {
               case '+':
               result=first + second;
               System.out.printf("The result of" +first+ " " +operator+ " " +second+  "is"  +result);
               break;
               case'-':
               result=first-second;
               if(second>first&& second==first)
               {    
                  System.out.printf("The result of" +first+ " " +operator+ " " +second+  "is"  +result);
               }               
               else if(first>second)
               {
                   System.out.printf("The result of" +first+ " " +operator+ " " +second+  "is -"  +result);
               }
            
               
               break;
               case'/':
               result=second/first;
               System.out.printf("The result of" +second+ " " +operator+ " " +first+  "is"  +result);
               break;
               case'%':
               result=second%first;
               System.out.printf("The result of" +second+ " " +operator+ " " +first+  "is"  +result);
               break;
               default:
               System.out.printf("Error!Operator not correct");
               return;
            }
    
}
}
       
            
           
           
        
   