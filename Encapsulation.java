class Student{
    private int rollno;
    private String name;
    public void setRollno(int r){
        rollno=r;
    }
    public int getRollno(){
        return rollno;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }


}
public class Encapsulation {
    public static void main(String args[]){
        Student obj=new Student();
        obj.setRollno(3);
        System.out.println(obj.getRollno());
        obj.setName("mahesh");
        System.out.println(obj.getName());

    }
}
