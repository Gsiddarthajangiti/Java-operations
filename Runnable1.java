class Hi3 implements Runnable{
    public void run(){
        int i;
        for(i=0;i<=5;i++){
            System.out.println("Hi");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class Hello3 implements Runnable{
    public void run(){
        int i;
        for(i=0;i<=5;i++){
            System.out.println("Hello");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}

public class Runnable1 {
    public static void main(String args[]){
        Runnable obj=new Hi3();//here every obj is converting to thread so we have to use start method
        Runnable obj1=new Hello3();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.start();
        try{Thread.sleep(10);} catch(Exception e){}
        t2.start();//when we are using start we have to use only run method

    }
}
