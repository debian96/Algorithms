 class Merge {

	private static void Merge(int[] arr, int p, int q, int r) {
		int n1,n2;
		n1 = q-p+1;
		n2 = r-q;
		
		int L[], R[];
		L = new int[n1];
		R = new int[n2];
		
		for (int i = 0; i < n1; i++) {
			L[i] = arr[p+i];
		}
		
		for (int j = 0; j < n2; j++) {
			R[j] = arr[q+1+j];
		}
		
		int i=0, j=0, k=p;
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				arr[k] = L[i];
				i++;
			}else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		//Copy the remaining elements of L[]
		while(i<n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		//Copy the remaining elements of R[]
		while(j<n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
		
	}
	
	private static void Merge_Sort(int[] arr, int p, int r) {
		if (p<r) {
			int q = (p+r)/2;
			Merge_Sort(arr, p, q);
			Merge_Sort(arr, q+1, r);
			Merge(arr,p,q,r);
		}
	}
	
	private static void printArray(int[] arr) {
		int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
		
	}
	
	public static void main(String[] args) {
		int arr[] = {2, 11, 13, 5, 6, 7};
		
		System.out.println("----------Before Sorted----------");
		printArray(arr);
		
		
		Merge_Sort(arr,0,arr.length-1);
		
		System.out.println("----------After Sorted----------");
		printArray(arr);
	}
}
