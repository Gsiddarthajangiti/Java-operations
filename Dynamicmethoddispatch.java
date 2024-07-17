class A3{
    public void show3(){
        System.out.println("in A");
    }
}
class B3 extends A3{
    public void show3(){
        System.out.println("in B");
    }
}
class C3 extends A3{
    public void show3(){
        System.out.println("in c");
    }
}
public class Dynamicmethoddispatch {
    public static void main(String args[]){
        A3 obj=new B3();//Dynamic method dispatch done by taking reference of super class and object of child class
        obj.show3();
        obj=new C3();
        obj.show3();
    }
}
