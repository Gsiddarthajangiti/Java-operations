//Types of Interface
//1.Normal-which has more than two methods
//2.single abstract method-which has only one method-also called Functional interface
//3.Marker interface-no method
//where ever we have functional interface we can use lambda expression
@java.lang.FunctionalInterface
interface Abc9{
    void show57();
}
public class FunctionalInterface {
    public static void main(String args[]) {
        Abc9 obj = () -> System.out.println("in A");//it is lambda expression
        obj.show57();
    }
}
