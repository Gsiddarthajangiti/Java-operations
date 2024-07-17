class Outer1{
    public void show(){
        System.out.println("failure");

    }
    static class Inner1{
        public void display(){
            System.out.println("success");
        }

    }
}
public class Innerclass1 {
    public static void main(String args[]){
        Outer1 obj=new Outer1();
        Outer1.Inner1 obj1=new Outer1.Inner1();
        obj.show();
        obj1.display();
    }
}
