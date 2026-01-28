//lamba expression example
//prime number
@FunctionalInterface
interface CheckPrime{
void checkPrime(int num);
}
class Example1{
public static void main(String[] args) {
    CheckPrime obj=(num)->{
        int cnt=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                cnt++;
            }
        }
        if(cnt+1>2){
            System.out.println(num+" not prime");
        }
        else{System.out.println(num+" is prime");

        }
    };
    obj.checkPrime(10);
    obj.checkPrime(11);
    obj.checkPrime(20);
    obj.checkPrime(23);

}
}