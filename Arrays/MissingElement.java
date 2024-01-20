// this method is used as expected_sum - total sum of array = element missing 

// package Arrays;

// public class MissingElement {
    
//     public static void main(String [] args){

//         int[] a = {1,2,3,4,6};

//         int expected_no_element = a.length+1;
//         int total_sum = expected_no_element*(expected_no_element+1)/2;

//         int sum =0; 
//         for(int i=0; i<a.length; i++){
//             sum = sum +a[i];

//         }
//         System.out.println("missing no is "+(total_sum - sum));
//     }
// }

// This method is used as the Xor method to find the missing no

package Arrays;

public class MissingElement {
    
    public static void main(String [] args){
       
       int [] a = {1,2,3,4,6};
       int xor1 = a[0];
       for(int i=1; i<a.length; i++){
           xor1 = xor1^a[i];
       }
       int xor2 = 1;
       for(int i=2; i<=(a.length+1); i++){
            xor2 = xor2^i;
       }
       System.out.println("missing element is "+(xor1 ^ xor2));
    }
}

