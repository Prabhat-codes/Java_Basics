class Test
{
    int a;
    int b;
    Test(int c,int d)
    {
        a=c;
        b=d;
    }
    boolean equal(Test ob)
    {
        if(ob.a==a && ob.b==b){
            return true;
        }
        else return false;
    }
}
class Demo{
    public static void main(){
        Test ob=new Test(1,2);
        Test od=new Test (1,2);
        Test oc=new Test(12,23);
        System.out.println("ob==oc"+ob.equal(oc));
        System.out.println("ob==od"+ob.equal(od));
    }
}