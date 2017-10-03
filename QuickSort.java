 class Quick {
	
	
	
	private static int Partition(int[] arr, int p, int r) {
		int pivot = arr[r];
		int i = p-1;
		for (int j = p; j < r; j++) {
			if(arr[j]<=pivot) {
				i = i+1;
				
				int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
			}
		}
		int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r] = temp;
 
        return i+1;
	}
	
	private static void Quick_Sort(int[] arr, int p, int r) {
		if (p<r) {
			int q = Partition(arr,p,r);
			Quick_Sort(arr, p, q-1);
			Quick_Sort(arr, q+1, r);
		}
	}
	

	private static void printArray(int[] arr) {
		int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
		
	}
	
	public static void main(String[] args) {
		int arr[] = {22, 1, 33, 2, 44, 6};
		
		System.out.println("----------Before Sorted----------");
		printArray(arr);
		
		
		Quick_Sort(arr,0,arr.length-1);
		
		System.out.println("----------After Sorted----------");
		printArray(arr);
	}

	
}
