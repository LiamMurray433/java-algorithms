import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] arr){
        int n = arr.length;

        // outer loop that ensures the last sorted element is ignored
        for(int i = 0; i < n - 1; i++){

            // inner loop that bubbles up the number being sorted
            for(int j = 0; j < n - i - 1; j++){

                // Swap higher element with lower element
                if (arr[j] > arr[j + 1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
