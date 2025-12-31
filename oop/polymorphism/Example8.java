class Example8{
    public static void main(String[] args) {
        Ramesh obj=new Suresh();
        System.out.println(obj instanceof Ganesh);
        System.out.println(obj instanceof Ramesh);
        System.out.println(obj instanceof Mahesh);
       Ramesh obj1=new Ganesh();
        System.out.println(obj1 instanceof Ganesh);//true
        System.out.println(obj1 instanceof Mahesh);//false
        System.out.println(obj instanceof Suresh);//true
        System.out.println(obj instanceof Ramesh);//true

        Mahesh obj3=new Mahesh();
        //System.out.println(obj3 instanceof Ganesh);//cte
        System.out.println(obj3 instanceof Ramesh);//true
        //System.out.println(obj3 instanceof Suresh);//cte

        Object str=new String();
        System.out.println(str instanceof Object);//true
        System.out.println(str instanceof StringBuffer);//false

        String str1=new String();
        //System.out.println(str1 instanceof StringBuffer);//cte
        System.out.println(str instanceof Object);//true

    }
}
class Ramesh{}
class Suresh extends Ramesh{}
class Ganesh extends Suresh{}
class Mahesh extends Ramesh{}
