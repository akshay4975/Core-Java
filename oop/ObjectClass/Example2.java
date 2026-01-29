//getClass()

class Employee{}
class Student{}
class Example2{
public static void main(String[] args) {
Example2 obj=new Example2();
    System.out.println(obj.getClass());//class Example2

    Employee obj1=new Employee();
    System.out.println(obj1.getClass().getName());//Employee
    System.out.println(obj1.getClass());//class Employee

    String str=new String("hello");
    System.out.println(str.getClass());//class java.lang.String
    System.out.println(str.getClass().getName());//java.lang.String


}



}