// 1.Brute force Approach

// package Arrays;

// public class PrintDuplicateElement {
    
//     public static void main(String [] args){

//         int[] a = {3,5,4,3,2,2,1};
        
//         for(int i=0; i<a.length; i++){
//             for(int j=i+1; j<a.length; j++){
//                 if(a[i] == a[j] && (i != j)){
//                     System.out.print(a[j]+" ");
//                 }
//             }
//         }
//     }
// }

// 2.using set Interface Method

// package Arrays;

// import java.util.Set;
// import java.util.HashSet;

// class PrintDuplicateElement {

//     public static void main(String [] args){

//         int[] a = {3,5,4,2,2,1}; 

//         Set<Integer> s = new HashSet<>();
//         for(int no:a){
//            if(s.add(no) == false ){
//             System.out.print(no+" ");
//            }
//         }
//     }
// }

// 3. By using Hash Table

package Arrays;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class PrintDuplicateElement {

    public static void main(String [] args){

        int [] arr = {3,5,4,3,2,2,1,3};

        Map<Integer,Integer> hm = new HashMap<>();
        for(int no:arr){
            Integer count = hm.get(no);
            if(count == null){
                hm.put(no,1);
            }
            else {
                count = count + 1;
                hm.put(no,count);
            }
        }
        Set<Map.Entry<Integer, Integer>> es = hm.entrySet();
        for(Map.Entry<Integer, Integer> me : es){
            if(me.getValue() > 1){
                System.out.print(me.getKey());
            }
        }
    }
}




