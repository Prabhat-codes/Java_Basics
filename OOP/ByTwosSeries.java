public class ByTwosSeries  {

public static void main(String[] args) {
ByTwos ob = new ByTwos();

System.out.println("Series: ");
System.out.println("Starting at: "+ ob. cur_val);
for(int i = 0; i<5; i++)
System.out.println("Next value: "+ ob.getNext());

System.out.println("Series: ");
ob.reset();
System.out.println("Starting at: "+ ob. cur_val);
for(int i = 0; i<5; i++)
System.out.println("Next value: "+ ob.getNext());


}
}