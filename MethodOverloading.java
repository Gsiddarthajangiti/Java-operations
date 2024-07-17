class Casio{
    public void add(int i,int j){
        System.out.println(i+j);
    }
    public void add(int i,int j,int k){
        System.out.println(i+j+k);
    }
    public void add(double i,double j){
        System.out.println(i+j);
    }

}
public class MethodOverloading {
    public static void main(String args[]){
        Casio obj=new Casio();
        obj.add(7,8);
        obj.add(8,9,7);
        obj.add(8.5,7.5);

    }
}
