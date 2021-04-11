/**
 * @description:Program to calculate the Area of a rectangle
 */
import java.util.Scanner;
class AreaofRectangle
{
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle ");
        double length = scanner.nextDouble();
        System.out.println("Enter the breadth of the Rectangle");
        double width = scanner.nextDouble();
        //Area = lenght*width;
        double area = length*width;
        System.out.println("Area of the Rectangle is:"+area);
    }
}
//}