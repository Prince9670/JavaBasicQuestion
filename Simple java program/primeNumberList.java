public class primeNumberList {
    
    public static void main(String []args){

        int temp = 0;
        for(int number=0; number<=100; number++){
            for(int i=2; i<=number-1; i++){
                if(number%i==0){
                    temp = temp + 1;
                }
            }
            if(temp == 0){
                System.out.println(number);
            }
            else {
                temp = 0;
            }
        }
    }
}
