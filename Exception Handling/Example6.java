public class Example6 {
    public static void main(String[] args) {
        String a=new String("abcdefghijklmnopqrstuvwxyz");
        System.out.println(a.isEmpty());
  
        try{
        a=null;
      
        System.out.println(a.isEmpty());//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isEmpty()" because "<local1>" is null

       } 
       catch(NullPointerException e){
        System.out.println("exception handled");
       }
        
    }
}
