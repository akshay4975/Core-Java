//checked exception

class InvalidWithdrawAmountException extends Exception{
    InvalidWithdrawAmountException(String desc){
        super(desc);
    }
}

class Example9{
    static double balance=20000;
    static int pin=1234;
public static void main(String[] args) {
    
    System.out.println("main Execution starts");
    try {
           withdrawAmount();
        
    } catch (InvalidWithdrawAmountException e) {
    System.out.println("invalid withdraw amount entered");
    }
 

}
public static void withdrawAmount()throws InvalidWithdrawAmountException{
    System.out.println("enter your pin : ");
    int userPin=new java.util.Scanner(System.in).nextInt();
    if(pin==userPin){
        System.out.println("Enter amount for withdraw:");
        double amount=new java.util.Scanner(System.in).nextDouble();
        if(amount<balance){ 
        System.out.println("withdraw amount:"+(balance-amount));
    }
    else{
         throw new InvalidWithdrawAmountException("entered withdraw amount is invalid ");

    }
}
} 
    

}