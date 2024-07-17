class Emp3{
    int eid;
    int salary;
    static String ceo;
    static{
        ceo="larry";
        System.out.println("in static");
    }
    public Emp3(){
        eid=80;
        salary=3000;
        System.out.println("in constructor");
    }
    public void show(){
        System.out.println("eid"+eid+"salary"+salary+"ceo"+ceo);
    }
}
public class DemoStatic3 {
    public static void main(String args[]){
        Emp3 navin=new Emp3();
        Emp3 rahul=new Emp3();
        navin.show();
        rahul.show();
    }
}
