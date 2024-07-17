interface Demo{
    void Abc();//in interface we can define a default method
    default void show(){
        System.out.println("In A");
    }
}
class DemoImp implements Demo{
    public void Abc(){//default method under this class by implements
        System.out.println("In demo");
    }
}
public class DefaultMethodInterface {
    public static void main(String args[]){
        Demo obj=new DemoImp();// we can access default method through class
        obj.Abc();
        obj.show();

    }
}
