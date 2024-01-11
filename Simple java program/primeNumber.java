public class primeNumber {
    
    public static void main(String []args){

        int number = 7;
        int temp = 0;
        for(int i=2; i<=number-1; i++){
            if(number%i==0){
                temp = temp+1;
            }
        }
        if(temp==0){
            System.out.println(number+" number is prime");
        }
        else {
            System.out.println(number+" number is not prime");
        }
    }
}
