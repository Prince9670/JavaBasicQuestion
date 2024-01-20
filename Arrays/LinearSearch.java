package Arrays;

public class LinearSearch {
    
    public static void main(String []args){

        int arr[] = {5,3,6,1,4,2};
        int item = 1;
        int temp =0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == item){
                System.out.print("element is present at "+i+" index position");
                temp = temp + 1;
            }
        }
        if(temp == 0){
                System.out.print("item not found in List");
            }
    }
}
