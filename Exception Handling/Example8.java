import java.util.*;
public class Example8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num : ");
        int num=0;
        try{
            num=sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("invalid num entered");
        }
        System.out.println("number:"+num);


    }
}
 