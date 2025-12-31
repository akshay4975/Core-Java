//compile time polymorphism in static methods :method overloading

class Demo{
    public static int addition(int a,int b){
        return  a+b;
    }
    public static int addition(int a,int b,int c){
        return  a+b+c;
    }
    public static int addition(int a,int b,int c,int d){
        return  a+b+c+d;
    }
}

class Example4{
    public static void main(String[] args) {
        System.out.println("Addition:"+Demo.addition(10,20));
        System.out.println("Addition:"+Demo.addition(10,20,30));
        System.out.println("Addition:"+Demo.addition(10,20,30,40));
        
    }
}