class Outer{
    public void show(){
        System.out.println("failure");

    }
    class Inner{
        public void display(){
            System.out.println("success");
        }

    }
}
public class Innerclass {
    public static void main(String args[]){
        Outer obj=new Outer();
        Outer.Inner obj1=obj.new Inner();
        obj.show();
        obj1.display();
    }
}
