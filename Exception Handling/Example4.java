public class Example4 {
    public static void main(String[] args) {
           
    String str="abcdefghijklmnnopvwxyz";
    for(int i=0; ;i++){
        char ch=' ';
        try{
            ch=str.charAt(i);
        }
        catch(StringIndexOutOfBoundsException e){
           
            break;
        }
        System.out.println(ch);
    }
}
}