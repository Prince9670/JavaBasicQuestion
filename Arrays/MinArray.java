package Arrays;

public class MinArray {
    
    public static void main(String [] args){

        int[] a = {1,3, 2, 7, 5, 15, 9}; 

        int min = a[0];
        for(int i=1; i<a.length; i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        System.out.println("minimum element is "+min);
    }
}
