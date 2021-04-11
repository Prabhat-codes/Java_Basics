import java.util.*;
class hotel
{
    int room;
    int day;
    double d;
    double cost;
    double amt;
    void accept()
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the type of room ");
        System.out.println("SEMI DELUXE-1  DELUXE-2  SUPERDELUXE-3");
        room=S.nextInt();
        System.out.println("Enter the no. of days");
        day=S.nextInt();
    }
    void calculate()
    {   
        if(room==1)
        {
            cost=2500;
        }
        else if(room==2)
        {
            cost=3500;
        }
        else if(room==3)
        {
            cost=5000;
        } 
        else
        {
            System.out.println("You gotta be kddin me");
        }
        if(day<=3)
        {
            d=(10/100)*cost;
        }
        else if(day>3 && day<=5)
        {
            d=(15/100)*cost;
        }
        else if(day>5 && day<=10)
        {
           d=(20/100)*cost;
        }
        else if(day>10)
        {
            d=(30/100)*cost;
        }
        else
        {
            System.out.println("invalid");
        }
    }
        void display()
        {
            amt=cost-d;
            System.out.println("Total room amount is"+amt);
        }
         public static void main()
        {
           hotel obj=new hotel();
           obj.accept();
           obj.calculate();
           obj.display();
    }
}

        
            
            
        
            
