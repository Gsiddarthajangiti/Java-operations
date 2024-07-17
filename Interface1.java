interface Abc1{
    void show();
}
public class Interface1 {
    public static void main(String args[]){
        Abc1 obj=new Abc1()
        {
            public void show(){
                System.out.println("in A");
            }

        };
        obj.show();
    }
}
