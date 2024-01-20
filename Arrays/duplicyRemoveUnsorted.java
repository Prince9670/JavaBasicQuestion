package Arrays;
import java.util.HashSet;

public class duplicyRemoveUnsorted {
    
    public static void main(String [] args){

        int[] a = {1,2,3,2,5,4,5};
        
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<a.length; i++){
            hs.add(a[i]);
        }
        for(int no:hs){
            System.out.print(no+" ");
        }
    }
}
