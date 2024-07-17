class Casio1{
    public int add(int ...n){
        int sum=0;
        for(int i:n){
            sum+=i;
        }
        return sum;
    }
}
public class Variableargs {
    public static void main(String args[]){
        Casio1 obj=new Casio1();
        System.out.println(obj.add(7,8,9,0,8,7,7,9));
    }
}
