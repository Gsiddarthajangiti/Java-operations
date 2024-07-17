class Hi2 extends Thread{// we are amking class as thread
    public void run(){
        int i;
        for(i=0;i<=5;i++){
            System.out.println("Hi");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class Hello2 extends Thread{
    public void run(){
        int i;
        for(i=0;i<=5;i++){
            System.out.println("Hello");
            try{Thread.sleep(1000);} catch(Exception e){}
        }

    }
}
public class MultiThreading2 {
    public static void main(String args[]){
        Hi2 obj=new Hi2();//here every obj is converting to thread so we have to use start method
        Hello2 obj1=new Hello2();
        obj.start();
        try{Thread.sleep(10);} catch(Exception e){}
        obj1.start();//when we are using start we have to use only run method

    }

}
