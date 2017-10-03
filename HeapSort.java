
class Heap {
	

	private static void Max_Heapify(int[] arr, int n, int i) {
		int l = 2*i+1;
		int r = 2*i+2;
		int largest = i;
		
		if (l<n && arr[l]>arr[largest]) 
			largest = l;
		if (r<n && arr[r]>arr[largest]) 
			largest = r;
		if(largest!=i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			Max_Heapify(arr, n, largest);
		}
	}
	
	private static void Heap_Sort(int[] arr) {
		int n = arr.length;
		
		for (int i =n/2-1; i >=0; i--) {
			Max_Heapify(arr,n,i);
		}
		
		for (int i = n-1; i >=0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			Max_Heapify(arr, i, 0);	
		}
	}
	
	

	private static void printArray(int[] arr) {
		int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
		
	}
	
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7};
		
		System.out.println("----------Before Sorted----------");
		printArray(arr);
		
		
		Heap_Sort(arr);
		
		System.out.println("----------After Sorted----------");
		printArray(arr);
	}

	
}
