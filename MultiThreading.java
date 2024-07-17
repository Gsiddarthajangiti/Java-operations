class Hi{
    public void show(){
        int i;
        for(i=0;i<=5;i++){
            System.out.println("Hi");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class Hello{
    public void show(){
        int i;
        for(i=0;i<=5;i++){
            System.out.println("Hello");
            try{Thread.sleep(1000);} catch(Exception e){}
        }

    }
}
public class MultiThreading {
    public static void main(String args[]){
        Hi obj=new Hi();
        obj.show();
        Hello obj1=new Hello();
        obj1.show();

    }
}
