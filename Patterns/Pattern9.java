// case 1

//    *****
//    *****
//    *****
//    *****


// package Patterns;

// public class Pattern9 {
    
//     public static void main(String [] args){

//         for(int i=1; i<5; i++){
//             for(int j=0; j<5; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// case 2

//  *       *
//   *     *
//    *   *
//      *
//    *  *
//   *     *
//  *       *

package Patterns;

public class Pattern9 {
    
    public static void main(String [] args){

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i==j || i+j==5-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}




