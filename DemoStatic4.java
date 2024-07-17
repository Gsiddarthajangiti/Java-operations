class Emp4{
    int eid;
    int salary;
    static String ceo;
    public Emp4(){
        eid=80;
        salary=3000;
        System.out.println("in constructor");
    }
    static{
        ceo="larry";
        System.out.println("in static");
    }
    public void show(){
        System.out.println("eid"+eid+"salary"+salary+"ceo"+ceo);
    }
}

public class DemoStatic4 {
    public static void main(String args[]){
        Emp4 navin=new Emp4();
        Emp4 rahul=new Emp4();
        navin.show();
        rahul.show();
    }
}
