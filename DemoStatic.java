class Emp{
    int eid;
    int salary;
    static String ceo;
    public void show(){
        System.out.println("eid"+eid+"salary"+salary+"ceo"+ceo);
    }
}
public class DemoStatic {
    public static void main(String args[]) {
        Emp navin = new Emp();
        navin.eid = 9;
        navin.salary = 300;
        navin.ceo = "mahesh";
        Emp rahul = new Emp();
        rahul.eid = 8;
        rahul.salary = 900;
        rahul.ceo = "nikita";
        navin.show();
        rahul.show();
    }}