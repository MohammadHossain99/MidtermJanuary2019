package algorithm;

import databases.ConnectToSqlDB;

import java.util.List;
import java.util.Random;

/*
 *Created by mrahman on 04/02/2018.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and retrieve data.
	 *
	 * At the end. After running all the sorting algo, come to a conclusion which one is suitable on given data set.
	 *
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[10000];
		storeRandomNumbers(num);
		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectToSqlDB.insertDataFromArrayToSqlTable(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");
        printValue(numbers);
		int n = num.length;
		randomize (num, n);

		//Insertion Sort
		algo.insertionSort(num);
		long insertionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Insertion Sort take: " + insertionSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "insertion_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("insertion_sort", "SortingNumbers");
		printValue(numbers);
		n = num.length;
		randomize (num, n);
		//By following above, Continue for rest of the Sorting Algorithm....

		//Bubble Sort
		algo.bubbleSort(num);
		long bubbleSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bubble Sort take: " + bubbleSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "bubble_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("bubble_sort", "SortingNumbers");
		printValue(numbers);
		n = num.length;
		randomize (num, n);

		//Merge Sort
		algo.selectionSort(num);
		long mergeSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Merge Sort take: " + mergeSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "merge_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("merge_sort", "SortingNumbers");
		printValue(numbers);
		n = num.length;
		randomize (num, n);

		//Quick Sort
		algo.selectionSort(num);
		long quickSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Quick Sort take: " + quickSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "quick_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("quick_sort", "SortingNumbers");
		printValue(numbers);
		n = num.length;
		randomize (num, n);

		// heap sort
		algo.heapSort(num, 1000);
		long heapSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Heap Sort take: " + heapSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "heapSort_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("heapSort_sort", "SortingNumbers");
		printValue(numbers);
		n = num.length;
		randomize (num, n);

		//bucket sort
		algo.bucketSort(num, 1000000 );
		long bucketSorttExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Bucket Sort take: " + bucketSorttExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "bucketSort_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("bucketSort_sort", "SortingNumbers");
		printValue(numbers);
		n = num.length;
		randomize (num, n);


		//shell Sort
		algo.shellSort(num);
		long shellSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of " + num.length + " numbers in Shell Sort take: " + shellSortExecutionTime + " milli sec");
		connectToSqlDB.insertDataFromArrayToSqlTable(num, "shellSort_sort", "SortingNumbers");
		numbers = connectToSqlDB.readDataBase("shellSort_sort", "SortingNumbers");
		printValue(numbers);
		n = num.length;
		randomize (num, n);



//		Come to conclusion about which Sorting Algo is better in given data set.
//		for 1000 numbers, sort took:
//		1. Selection sort: 3 milli sec
//		2. Insertion sort: 3 milli sec
//		3. Bubble sort: 5 milli sec
//		4. Merge sort: 1 milli sec
//		5. Quick sort: 0 milli sec
//		6. Heap sort: 0 milli sec
//		7. Bucket sort: 7 milli sec
//		8. Shell sort: 0 milli sec

		//		Come to conclusion about which Sorting Algo is better in given data set.
//		for 10000 numbers, sort took:
//		1. Selection sort: 48 milli sec
//		2. Insertion sort: 16 milli sec
//		3. Bubble sort: 201 milli sec
//		4. Merge sort: 55 milli sec
//		5. Quick sort: 28 milli sec
//		6. Heap sort: 1 milli sec
//		7. Bucket sort: 8 milli sec
//		8. Shell sort: 4 milli sec

		//Heap sort works the best.


////| Tables_in_pnt    |
//				+------------------+
//				| bubble_sort      |
//				| bucketsort_sort  |
//				| heapsort_sort    |
//				| insertion_sort   |
//				| merge_sort       |
//				| quick_sort       |
//				| selection_sort   |
//				| shellsort_sort   |
//				| tbl_lowestnumber |
//				+------------------+

	}

	public static void storeRandomNumbers(int [] num){
		Random rand = new Random();
		for(int i=0; i<num.length; i++){
			num[i] = rand.nextInt(1000000);
		}
	}

	public static void randomize( int arr[], int n)
	{
		Random r = new Random();
		// Start from the last element and swap one by one. We don't
		// need to run for the first element that's why i > 0
		for (int i = n-1; i > 0; i--) {
			int j = r.nextInt(i);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
	public static void printValue(List<String> array){
		for(String st:array){
			System.out.println(st);
		}
	}
}
