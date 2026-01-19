class Parent{
    public static Object m1(){
        System.out.println("Parent");
        return null;
    }
}


    class Child extends Parent{
        public static StringBuffer m1(){
    System.out.println("Child");
return null;
        }
    }
class Example13{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.m1();

        
    }
}
