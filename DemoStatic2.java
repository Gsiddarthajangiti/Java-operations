class Emp2{
    int eid;
    int salary;
    static String ceo;
    public Emp2(){
        eid=80;
        salary=3000;
        ceo="mahesh";
    }
    public void show(){
        System.out.println("eid"+eid+"salary"+salary+"ceo"+ceo);
    }
}
public class DemoStatic2 {
    public static void main(String args[]){
        Emp2 navin=new Emp2();
        Emp2 rahul=new Emp2();
        navin.show();
        rahul.show();
    }
}
