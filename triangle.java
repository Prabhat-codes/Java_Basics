

//to display the type of triangle
import java.io.*;
public class triangle 
{
    public static void main()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int a,b,c;
        System.out.println("Enter three sides of a triangle");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        c=Integer.parseInt(in.readLine());
        if((a+b>c)&&(b+c>a)&&(c+a>b))
        {
            System.out.println("Triangle is possible");
            if((a==b)&&(b==c)&&(c==a))
            System.out.println("Equilateral Triangle");
            else if((a==b)||(b==c)||(c==a))
            System.out.println("Isoceles Triangle");
            else if((a!=b)&&(b!=c)&&(c!=a))
            System.out.println("Scalene Triangle");
        }
        else
        System.out.println("Triangle is not possible");
    }
}