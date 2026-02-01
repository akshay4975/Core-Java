public class Example5 {
    public static void main(String[] args) {
        int arr[]=null;
        try{
            arr=new int[-19];

        }
        catch(NegativeArraySizeException e){
            System.out.println("NIOOBE");
        }
    }
}
