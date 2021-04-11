public class ByTwoThreesSeries  {
public static void main(String[] args) {
ByTwos ob2 = new ByTwos();
ByThrees ob3 = new ByThrees();

System.out.println("ByTwo Series: ");
System.out.println("Starting at: "+ ob2. cur_val);
for(int i = 0; i<5; i++)
System.out.println("Next value: "+ ob2.getNext());

System.out.println("ByThree Series: ");
ob3.reset();
System.out.println("Starting at: "+ ob3. cur_val);
for(int i = 0; i<5; i++)
System.out.println("Next value: "+ ob3.getNext());


}
}
