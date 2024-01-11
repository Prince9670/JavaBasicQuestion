import java.util.Scanner;

public class factorialUsingRecursion {
    
    static int fact =1;
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no :");
        int number = sc.nextInt();
        factorialUsingRecursion ob = new factorialUsingRecursion();
        ob.calcFact(number);
        System.out.println("factorial of "+number+" is "+fact);
    }
    void calcFact(int number){
        if(number>=1){
            fact=fact*number;
            calcFact(number-1);
        }
    }
}
