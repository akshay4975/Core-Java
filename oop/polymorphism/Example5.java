//compile time polymorphism in non- static methods :method overloading

class Demo{
    public int addition(int a,int b){
        return  a+b;
    }
    public int addition(int a,int b,int c){
        return  a+b+c;
    }
    public int addition(int a,int b,int c,int d){
        return  a+b+c+d;
    }
}

class Example5{
    public static void main(String[] args) {
        Demo obj=new Demo();
        System.out.println("Addition:"+obj.addition(10,20));
        System.out.println("Addition:"+obj.addition(10,20,30));
        System.out.println("Addition:"+obj.addition(10,20,30,40));
        
    }
}