class varargs{
static void show(int a,int ...x)
{   
    System.out.println(a+" "+x[0]);
}
public static void main(){
    show(1);
}}