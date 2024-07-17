class calculator{
    public int add(int i, int j){
        return (i+j);
    }
}
class calcAdv extends calculator{
    public int sub(int i,int j){
        return (i-j);
    }
}
class calcveryAdv extends calcAdv{
    public int multi(int i,int j){
        return (i*j);
    }
}
public class Inheritance {
    public static void main(String args[]){
        calcAdv obj=new calcAdv();
        System.out.println(obj.add(6,3));
        System.out.println(obj.sub(6,3));
        calcveryAdv obj1=new calcveryAdv();
        System.out.println(obj1.add(9,3));
        System.out.println(obj1.sub(9,3));
        System.out.println(obj1.multi(99,3));
    }
}
