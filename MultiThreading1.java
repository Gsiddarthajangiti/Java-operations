class Hi1 extends Thread{// we are making class as thread
    public void run(){
        int i;
        for(i=0;i<=5;i++){
            System.out.println("Hi");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class Hello1 extends Thread{
    public void run(){
        int i;
        for(i=0;i<=5;i++){
            System.out.println("Hello");
            try{Thread.sleep(1000);} catch(Exception e){}
        }

    }
}
public class MultiThreading1 {
    public static void main(String args[]){
        Hi1 obj=new Hi1();//here every obj is converting to thread so we have to use start method
        Hello1 obj1=new Hello1();
        obj.start();
        obj1.start();//when we are using start we have to use only run method

    }
}
