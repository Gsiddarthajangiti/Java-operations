interface Abc{
    void show();
}
class Implementor implements Abc{
    public void show(){
        System.out.println("in A");
    }
}
public class Interface {
    public static void main(String args[]){
        Abc obj=new Implementor();
        obj.show();

    }
}
