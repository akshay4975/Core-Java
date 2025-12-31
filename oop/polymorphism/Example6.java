class Demo{
    Demo(){
        System.out.println("No-argument constructor");
    }
    Demo(int a){
        System.out.println("int-argument constructor");
    }
    Demo(byte b){
        System.out.println("byte-argument constructor");
    }
}
class Example6{
    public static void main(String[] args) {
        Demo obj1=new Demo();
        Demo obj2=new Demo(10);
        Demo obj3=new Demo(1);
    }
}