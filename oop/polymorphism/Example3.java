class Human{
    public void human(){
        System.out.println("Hello from Human");
    }
}
class Son extends Human{
    public void son(){
        System.out.println("Hello from Son");
    }
}
class Student extends Son{
    public void student(){
        System.out.println("Hello from Student");
    }
}
class Example3{
    public static void main(String[] args) {
        Student obj1=new Student();
        Son obj2=obj1;
        Human obj3=obj1;
        obj1.student();
        obj1.human();
        obj1.son();
        System.out.println("obj1"+obj1);//
        System.out.println("obj2"+obj2);//all three share same memory of student object
        System.out.println("obj3"+obj3);//

        
        

    }
}