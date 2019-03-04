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
        for(int i=0;i<array.length;i++)
        {
            for (int j=0;j<10;j++)
            {
                if(array[i]<array[j])
                {
                    int temp = array[i];
                    array[i]=array[j];
                    array[j] = temp;
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int [] mergeSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

//    public int [] mergeSort(int [] array){
//        int [] list = array;

    //        //implement here
//
//
//        return list;
//    }
    

    public int [] quickSort(int [] array){
        int [] list = array;
        final long startTime = System.currentTimeMillis();
        //implement here

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here


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
