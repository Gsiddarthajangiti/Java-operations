// there are some classes in java like Integer
public class Wrapper {
    public static void main(String args[]){
        int i=5;//primitive datatype here i is a variable
        Integer ii=new Integer(i);//boxing-in this primitive variable is assigned to class
        int j=ii.intValue(); //unboxing  //intValue is a method that fetches the value of integer class object
        Integer value=i;//here primitive value is directly assigned so it is auto boxing
        int k= value;//auto unboxing
        System.out.println(k);
    }
}
