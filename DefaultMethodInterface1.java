interface Demo1{
    void Abc();
    default void show(){
        System.out.println("in demo");
    }

}
interface MyDemo{
    default void show(){
        System.out.println("in my demo show");
    }
}
class DemoImp1 implements Demo1,MyDemo{
    public void Abc(){
        System.out.println("hello");
    }
    @Override
   public void show(){
        Demo1.super.show();
    }
}


public class DefaultMethodInterface1 {
    public static void main(String args[]){
        Demo1 obj=new DemoImp1();
        obj.show();
        obj.Abc();

    }
}
