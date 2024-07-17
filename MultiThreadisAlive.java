public class MultiThreadisAlive {
    public static void main(String args[]) throws Exception{
        Thread t1=new Thread(()->{
            for(int i=1;i<=5;i++){
                System.out.println("hi");
                try{Thread.sleep(1000);} catch(Exception e){}
            }
        });

        Thread t2=new Thread(()->{
            for(int i=1;i<=5;i++) {
                System.out.println("hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });

        t1.start();
        try{Thread.sleep(10);} catch(Exception e){}
        t2.start();
        System.out.println(t1.isAlive());//isAlive before join gives true after join gives false because after join t1 and t2 deads
        t1.join();//by putting join we will get exception we will get error to get rid of it we have to put throws Exception straight to main
        t2.join();
        System.out.println(t2.isAlive());
        System.out.println("bye");//here bye will print in middle of hello and hi if we do not put join

    }

}
