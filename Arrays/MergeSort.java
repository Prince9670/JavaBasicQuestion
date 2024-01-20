package Arrays;

public class MergeSort {
    
    int[] array;
    int[] tempMergeArr;
    int length;
    public static void main(String []args){

        int[] inputArr = {48,36,13,52,19,21};
        MergeSort ms = new MergeSort();
        ms.sort(inputArr);

        for(int i: inputArr){
            System.out.print(i+" ");
        }
    }
    public void sort(int inputArr[]){
        this.array=inputArr;
        this.length=inputArr.length;
        this.tempMergeArr = new int[length];
        divideArray(0, length-1);
    }
    public void divideArray(int lowerIndex, int higerIndex){
        if(lowerIndex < higerIndex){
            int mid = lowerIndex+(higerIndex-lowerIndex)/2;

            // for sorting left side array
            divideArray(lowerIndex, mid);

            // for sorting right side array
            divideArray(mid+1, higerIndex);

            mergeArray(lowerIndex, mid, higerIndex);
        }
    }
    public void mergeArray(int lowerIndex, int mid, int higerIndex){

        for(int i=lowerIndex; i<=higerIndex; i++){
            tempMergeArr[i] = array[i];

        }
        int i= lowerIndex;
        int j = mid+1;
        int k = lowerIndex;
        while(i<mid && j<=higerIndex){
            if(tempMergeArr[i] <= tempMergeArr[j]){
                array[k] = tempMergeArr[i];
                i++;
            }
            else {
                array[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }
}
