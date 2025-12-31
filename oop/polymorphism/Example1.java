class Mahesh{

}
class Ramesh extends Mahesh{

}
class Suresh extends Mahesh{

}
class Example1{
    public static void main(String[] args) {
        Mahesh obj=new Ramesh();
    //parent refrence(Mahesh)   //child object(Ramesh)
        Mahesh obj1=new Suresh();
       // Suresh obj2=new Ramesh();//CTE:incompatible types: Ramesh cannot be converted to Suresh

    }
}