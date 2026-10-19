import java.util.Arrays;

public class Main {

    public static void mergeSort(int[] array){
        int length = array.length;
        if(length<=1) return;
        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length-middle];
        int i = 0; //left
        int j = 0; // right

        for(; i < length ; i++){
            if(i<middle){
                leftArray[i] = array[i];
            }else{
                rightArray[j] = array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray , array);

    }

    public static void merge(int[] left , int[] right , int[] array){
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0 , l = 0 , r =0 ;

        while(l < leftSize && r < rightSize){
            if(left[l] < right[r]){
                array[i] = left[l];
                i++;
                l++;
            }else{
                array[i] = right[r];
                i++;
                r++;
            }
        }

        while(l < leftSize){
            array[i] = left[l];
            i++;
            l++;
        }

        while(r < rightSize){
            array[i] = right[r];
            i++;
            r++;
        }


    }


    public static void main(String[] args) {
        int[] array=  {8,6,7,2,1,44,210,222,67,665};
        mergeSort(array);
        System.out.println(Arrays.toString(array));

    }

}
