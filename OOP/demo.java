class demo{
    public static void main(){
        stack ob=new stack();

        ob.push(10);
        ob.push(100);
        ob.push(200);
        ob.pop();
        ob.display();
        System.out.println("Hello");
    }
}
class stack
{
    int a[]=new int[15];
    int top;
    stack(){
        top=-1;
    }
    void push(int p){
        a[++top]=p;
    }
    void pop(){
        int x=a[top--];
        System.out.println("Popping :" + x);
    }
    void display(){
        System.out.println("Stack contents are:");
        for(int i=0;i<14;i++){
            System.out.println(a[i]);
        }
    }
}

        
      
        