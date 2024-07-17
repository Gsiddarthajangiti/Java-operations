class A{
    public A(){
        System.out.println("in A");
    }
    public A(int i){
        System.out.println("init A");
    }
}
class B extends A{
    public B(){//Every constructor defaultly has super method so it calls the constructor of super class
        System.out.println("in B");
    }
    public B(int i){
        System.out.println("init B");
    }
}
public class Super {
    public static void main(String args[]){
        B obj=new B();
    }
}
