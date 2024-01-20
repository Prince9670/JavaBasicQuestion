// This program is for 1D Array 

// package Arrays;

// public class ArrayTraverse {
    
//     public static void main(String [] args){

//         int[] a = {10, 20, 30};

//         for(int i=0; i<a.length; i++){
//             System.out.print(a[i]+" ");
//         }
//     }
// }

// This program is for 2D Array

// package Arrays;

// public class ArrayTraverse {
    
//     public static void main(String [] args){

//         int[][] a = {{10, 20, 30}, {30, 40, 50}};

//         for(int i=0; i<a.length; i++){
//             for(int j=0; j<a[i].length; j++){
//                 System.out.print(a[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// This program is for 3D Array

package Arrays;

public class ArrayTraverse {
    
    public static void main(String [] args){

        int[][][] a = {{{10, 20}, {30,40,50}}, {{60, 70, 80}, {90,100}}};

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                for(int k=0; k<a[i][j].length; k++){
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
        }
    }
}



