//hashCode()
//equals
//toString()

class Mobile{
String brand;
String model;
String price;


Mobile(String model,String brand,String price){
    this.brand=brand;
    this.model=model;
    this.price=price;
}
@Override
public String toString(){
    return brand+" :" +model+":"+price;
}
@Override
public boolean equals(Object obj){
    return this.hashCode()==obj.hashCode();
}
@Override
public int hashCode(){
    int hc=brand.hashCode()+model.hashCode()+price.hashCode();
    return hc<0?hc*=-1:hc;
}

}
class Example3{
    public static void main(String[] args) {
        Mobile obj=new Mobile("samsung", "s23", "60000");
        Mobile obj2=new Mobile("samsung", "s24", "60000");
        Mobile obj3=new Mobile("samsung", "s23", "60000");
System.out.println(obj);
System.out.println(obj2);
System.out.println(obj3);
System.out.println(obj.equals(obj2));
System.out.println(obj.equals(obj3));

System.out.println(obj.hashCode());
System.out.println(obj2.hashCode());
System.out.println(obj3.hashCode());


    }
}