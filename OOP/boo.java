

class boo{
       static double add(int x, double y) { return x + y; }

static double add(double x, int y) { return x + y + 1; }
    public static void main(){
    System.out.println("A"+add(3, 3.14));   
    System.out.println("B"+add(3.14, 3));
    System.out.println("C"+add(3,3));
    System.out.println("A"+add(3.14, 3.14));
}}
