package algorithm;
import java.util.ArrayList;
public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        for(int k=1; k<array.length-1; k++)
        {
            int temp = array[k];
            int j= k-1;
            while(j>=0 && temp <= array[j])
            {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int n = array.length;
        int temp = 0;
        for(int i=0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    //swap elements
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    private static void merge(int list[], int low, int middle, int high) {

        int IstList_end = middle;

        int IIndList_start = middle + 1;

        int l = low;

        while ((l <= IstList_end) && (IIndList_start <= high)) {

            if (list[low] < list[IIndList_start]) {

                low++;

            } else {

                int temp = list[IIndList_start];

                for (int j = IIndList_start - 1; j >= low; j--) {

                    list[j + 1] = list[j];

                }

                list[low] = temp;

                low++;

                IstList_end++;

                IIndList_start++;

            }

        }
    }

    public int [] mergeSort(int [] array,int firstIndex,int lastIndex){
            final long startTime = System.currentTimeMillis();
            int [] list = array;
            int low = firstIndex;
            int high = lastIndex;
            if (low < high)
            {
                int middle = low+(high-low)/2;
                mergeSort(list, low, middle);
                mergeSort(list, middle+1, high);

                merge(list, low, middle, high);
            }

            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;
        }


    int partition(int list[], int low, int high)
    {
        int pivot = list[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (list[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = list[i+1];
        list[i+1] = list[high];
        list[high] = temp;

        return i+1;
    }


    public int [] quickSort(int [] array,int firstIndex, int lastIndex){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        int low = firstIndex;
        int high = lastIndex;
        if (low < high)
        {
            int pi = partition(list, low, high);
            quickSort(list, low, pi - 1);
            quickSort(list, pi + 1, high);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    void heapify(int list[], int arrayLength, int rootIndex)
    {
        int largest = rootIndex;
        int leftNodeIndex = 2*rootIndex + 1;
        int rightNodeIndex = 2*rootIndex + 2;


        if (leftNodeIndex < arrayLength && list[leftNodeIndex] > list[largest])
            largest = leftNodeIndex;

        if (rightNodeIndex < arrayLength && list[rightNodeIndex] > list[largest])
            largest = rightNodeIndex;


        if (largest != rootIndex)
        {
            int temp = list[rootIndex];
            list[rootIndex] = list[largest];
            list[largest] = temp;

            heapify(list, arrayLength, largest);
        }
    }


    public int [] heapSort(int [] array,int arrayLength){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        for (int i = arrayLength / 2 - 1; i >= 0; i--)
            heapify(list, arrayLength, i);

        for (int i=arrayLength-1; i>=0; i--)
        {
            int temp =list[0];
            list[0] = list[i];
            list[i] = temp;

            heapify(list, i, 0);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int [] bucketSort(int [] array,int maxArrayElementValue){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        int max = maxArrayElementValue;
        int [] bucket=new int[max+1];

        for (int i=0; i<bucket.length; i++) {
            bucket[i]=0;
        }

        for (int i=0; i<list.length; i++) {
            bucket[list[i]]++;
        }

        int position=0;
        for (int i=0; i<bucket.length; i++) {
            for (int j=0; j<bucket[i]; j++) {
                list[position++]=i;
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }



    
    public int [] shellSort(int [] array){
        int [] list = array;
        final long startTime = System.currentTimeMillis();
        //implement here
        int i, j, k, tmp;
        for (i = array.length / 2; i > 0; i = i / 2)
        {
            for (j = i; j < array.length; j++)
            {
                for(k = j - i; k >= 0; k = k - i)
                {
                    if (array[k+i] >= array[k])
                        break;
                    else
                    {
                        tmp = array[k];
                        array[k] = array[k+i];
                        array[k+i] = tmp;
                    }
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }


}