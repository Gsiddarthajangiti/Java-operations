interface Ram{
    int i=9;
    void show();// we can have default and static method in interface
    static void display(){
        System.out.println("hello");
    }
}
class Gopal implements Ram{
    public void show(){
       // i=10;// it is showing error because once we assign variables in interface it will become final it means it has final defaultly
        System.out.println(i);/*it is fetching value from interface because the class which implements will has all methods and
        variables under in it*/
    }
}
public class StaticMethodInterface {
    public static void main(String args[]){
        Ram.display();//we can call static method directly by interface name
        Ram obj=new Gopal();
        obj.show();

    }
}
