//toString()
import java.util.*;
class Student extends Object{
    String name;
    String address;
    String education;
    int yop;

    Student(String name,String address,String education,int yop){
        this.name=name;
        this.address=address;
        this.education=education;
        this.yop=yop;

    }
    @Override
    public String toString(){
        return "Student Name  : "+name+"  ADDRESS : "+"     "+address+"  EDUCATION : "+education+"  YOP : "+yop;

    }


}
class Example1{
    public static void main(String[] args) {
        Student obj=new Student("Akshay Nabage", "PUNE",
         "BE-E&TC", 2026);
    
    System.out.println(obj);
    
        }

    
}