class Calc{
    int num1;
    int num2;
    int result;
    public Calc(){
        num1=5;
        num2=5;
        System.out.println("constructor");
    }
    public Calc(int i){
        num1=i;
        num2=i;
        System.out.println("in constructor");
    }
    public Calc(int i,double j){
        num1=i;
        num2=(int) j;
        System.out.println("init constructor");
    }


}
public class Constructor {
    public static void main(String args[]){
        Calc obj=new Calc(7,7.8);
        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}
