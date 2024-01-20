package Arrays;

public class SecondLargestArray {
    
    public static void main(String [] args){

        int[] a = {6,8,3,4,2,1,5,7,9};

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i=0; i<a.length; i++){
            if(a[i] > largest){
                second_largest = largest;
                largest = a[i];
            }
            else if(a[i] > second_largest && a[i] != largest){
                second_largest=a[i];
            }
        }
        if(second_largest == Integer.MIN_VALUE){
            System.out.println("there is no second largest element in the list");
        }
        else {
            System.out.println("second largest value is "+second_largest);
        }
    }
}
