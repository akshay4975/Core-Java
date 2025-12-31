import java.util.Scanner;
class Bank{
    String name;
    final Long ACCOUNT_NUMBER;
    final String IFSC_CODE;
    long contact;
    final long DEBIT_CARD;
    final int CVV;
    Bank(String name,String IFSC_CODE,long ACCOUNT_NUMBER,long contact,long DEBIT_CARD,int CVV){
        this.name=name;
        this.IFSC_CODE=IFSC_CODE;
        this.ACCOUNT_NUMBER=ACCOUNT_NUMBER;
        this.contact=contact;
        this.DEBIT_CARD=DEBIT_CARD;
        this.CVV=CVV;
    }
        public void displayBank(){
            System.out.println("BAnk Name:"+name);
            System.out.println("BAnk IFSC CODE:"+IFSC_CODE);
            System.out.println("BAnk Account Number:"+ACCOUNT_NUMBER);
            System.out.println("BAnk Contact:"+contact);
            System.out.println("BAnk Debit card:"+DEBIT_CARD);
            System.out.println("CVV:"+CVV);

    
        }
    }

class Payment{
    String name;
    String email;

    public void proceedPayment(Payment obj){
        if(obj instanceof PhonePay){
            PhonePay obj1=(PhonePay)obj;
            obj1.displayPhonePay();

        }
       else if(obj instanceof GooglePay){
            GooglePay obj1=(GooglePay)obj;
            obj1.displayGooglePay();
        }
        
    }
}
class PhonePay extends Payment{
    String appName="PhonePay";
    Bank bank=new Bank("SBI", "SBI12345678",123456789, 987654321l, 1223_1234_1234l, 123);
public void displayPhonePay(){
    System.out.println("app name:"+appName);
    bank.displayBank();
}
}
class GooglePay extends Payment{
    String appName="GooglePay";
    Bank bank=new Bank("BOI", "BOI12345678",123456789, 987654321l, 1223_1234_1234l, 123);
public void displayGooglePay(){
    System.out.println("app name:"+appName);
    bank.displayBank();
}
}
class Flipkart{
    String name;
    long contact;
    Flipkart(String name,long contact){
        this.name=name;
        this.contact=contact;
    }
            Scanner sc=new Scanner(System.in);
        
    public void payment(){
        for(;;){
            System.out.println("Payment module");
            System.out.println("1.Phone pay");
            System.out.println("2.GOogle Pay");
            System.out.println("3.cod");
            System.out.println("Enter Your option:");
          
            
            int option=sc.nextInt();
            switch(option){
                case 1:{
                    PhonePay obj=new PhonePay();
                    obj.proceedPayment(obj);
                    
                    break;

                }
                case 2:{
                    GooglePay obj=new GooglePay();
                    obj.proceedPayment(obj);

              

                    break;
                }
                case 3:{
                    System.out.println("keep your cash ready");


                }
                default:{
                    System.out.println("invalid option");
                }
            }

        }

    }
}
class Example7 {
    public static void main(String[] args) {
        Flipkart f = new Flipkart("Flipkart", 9876543210L);
        f.payment();
    }
}
