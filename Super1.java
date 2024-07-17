class A1{
    public A1(){
        System.out.println("in A");
    }
    public A1(int i){
        System.out.println("init A");
    }
}
class B1 extends A1{
    public B1(){
        super(6);
        System.out.println("in B");
    }
    public B1(int i){
       super(i);
        System.out.println("init B");
    }
}
public class Super1 {
    public static void main(String args[]){
        B1 obj=new B1();
    }
}
