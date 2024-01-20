// first method it take more time

// package Arrays;

// public class FirstDuplicateElement {

//     public static void main(String[] args) {

//         int[] a = {6,5,3,2,5,1,2,4};
//         for(int i=0; i<a.length-1; i++){
//             int temp =0; 
//             for(int j=i+1; j<a.length; j++){
//                 if(a[i] == a[j] && (i!=j)){
//                     System.out.print("first duplicate element is "+a[i]);
//                     temp = temp+1;
//                     break;
//                 }
//             }
//             if(temp > 0){
//                 break;
//             }
//         }
//     }
    
// }

package Arrays;
import java.util.HashSet;

public class FirstDuplicateElement {

    public static void main(String[] args) {

        int[] a = {6,5,3,2,1,2,4};

        int temp = -1;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=a.length-1; i>=0; i--){
            if(hs.contains(a[i])){
                temp =i;
            }
            else {
                hs.add(a[i]);
            }
        }
        if(temp != -1){
           System.out.println("first duplicate element is "+a[temp]); 
        }
        else {
            System.out.println("first duplicate element not found");
        }
    }
}
