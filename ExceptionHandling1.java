public class ExceptionHandling1 {
    public static void main(String args[]){
        try{
            int a[]=null;//it is null pointer error it does not comes under first catch block so we compulsory nees to put Exception catch block
            a[7]=9;
            int k=9/0;
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("error");
        }
        catch(Exception e){
            System.out.println("Error");
        }
        finally{
            System.out.println("bye");
        }
    }
}
