public class ExceptionHandling {
    public static void main(String args[]){

        try{
            int a[]=new int[6];
            a[7]=9;
            int k=9/0;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error");
        }
        catch(ArithmeticException e){
            System.out.println("Error");
        }
        finally{//finally will excute if it gets error also and if it does not get error also
            System.out.println("bye");
        }

    }
}
