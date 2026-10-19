import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] array){
        int length = array.length;
        if(length == 1) return;
        int middle = array.length / 2 ;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        int i = 0 , j = 0 ;

        for( ; i < length ; i++){
            if(i < middle){
                leftArray[i] = array[i];
            }else{
                rightArray[j] = array[i];
                j++;
            }
        }


        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray , rightArray , array);

    }

    public static void merge(int[] leftArray , int[] rightArray , int[] array){
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0 , l = 0 , r = 0 ;

        while(l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while(r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }



    public static void main(String[] args) {
        int[] array = {12,5,77,6,2,1,-22,-4,0,88,32};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
