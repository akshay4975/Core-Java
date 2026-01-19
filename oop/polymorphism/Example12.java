class Parent{
    public static String m1(){
        System.out.println("Parent");
        return null;
    }
}


    class Child extends Parent{
        public static Object m1(){
    System.out.println("Child");
return null;
        }
    }
class Example12{
    public static void main(String[] args) {
        Child obj=new Child();
        obj.m1();

        
    }
}
// cte:  return type Object is not compatible with String