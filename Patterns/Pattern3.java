// this pattern is for
//        *
//       ** 
//      ***
//     ****

// package Patterns;

// public class Pattern3 {
    
//     public static void main(String []args){

//         for(int i=1; i<=4; i++){
//             // for loop for printing spaces 
//             for(int j=4; j>=i; j--){
//                 System.out.print(" ");
//             }
//             // for printing the star
//             for(int k=1; k<=i; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// case 2 pattern for 
//   ****
//    ***
//     **
//      *

package Patterns;

public class Pattern3 {
    
    public static void main(String []args){

        for(int i=1; i<=4; i++){
            // for loop for printing spaces 
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            // for printing the star
            for(int k=4; k>=i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

