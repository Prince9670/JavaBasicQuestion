// this program is basically for finding the common elements in the two array

// package Arrays;

// import java.util.HashSet;

// public class CommonElement {

//     public static void main(String[] args){
        
//         HashSet<Integer> hs = new HashSet<>();
//         int[] arr1 = {4,3,7,9,4};
//         int[] arr2 = {5,1,4,8,3};

//         for(int i=0; i<arr1.length; i++){
//             for(int j=0; j<arr2.length; j++){
//                 if(arr1[i] == arr2[j]){
//                     hs.add(arr1[i]);
//                     break;
//                 }
//             }
//         }
//         for(int no:hs){
//             System.out.print(no+",");
//         }
//     }
    
// }

// Another way by using the Hashset 

//         int[] arr1 = {4,3,7,9,4};
//         int[] arr2 = {5,1,4,8,3};

//         HashSet<Integer> hs = new HashSet<>();
//         for(int no:arr1){
//             hs.add(no);
//         }

//         for(int no:arr2){
//             boolean b = hs.add(no);
//             if(b== false) {
//                 System.out.print(no);
//             } 
//         }
  
//     }
// }

// In this program we see that how we can find the common element in three sorted array;

package Arrays;

import java.util.ArrayList;

public class CommonElement {

    public static void main(String[] args){

        int[] arr1 = {2,4,8};
        int[] arr2 = {2,3,4,8,10,16};
        int[] arr3 = {2,8,14,40};

        int x=0, y=0, z=0;

        ArrayList<Integer> al = new ArrayList<>();
        while(x<arr1.length && y<arr2.length && z<arr3.length){
            if(arr1[x] == arr2[y] && arr2[y] == arr3[z]){
                al.add(arr1[x]);
                x++;
                y++;
                z++;
            }
            else if(arr1[x]<arr2[y]){
                x++;
            }
            else if (arr2[y]<arr3[z]){
                y++;
            }
            else {
                z++;
            }
        }
        for(int no: al){
            System.err.println(no);
        }

    }
}


