class L1{
    public void display1(){
        System.out.println("in L");
    }
}
class M1 extends L1{
    @Override//if do you have any spelling mistakes in child class method it will show red mark(@override)
    public void display1(){
        super.display1();
        System.out.println("init L");// to stop overriding and call super class method we have to use super.method() function
    }
}
public class Demooverriding1 {
    public static void main(String args[]){
        M1 obj=new M1();
        obj.display1();

    }
}
