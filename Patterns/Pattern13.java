package Patterns;

public class Pattern13 {
    
    public static void main(String []args){

        for(int i=1; i<=5; i++){
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

//  1
//  21
//  321
//  4321
//  54321

