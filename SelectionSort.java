
class Selection {
	
	
	public static void Selection_Sort(int A[]){
		int temp;
		int n = A.length;
		for (int i = 0; i <n-1; i++) {
			
			int min = i;
			for (int j = i+1; j < n; j++) {
				if(A[min]>A[j]) {
					min = j;
				}
			}
			temp = A[min];
			A[min] = A[i];
			A[i] = temp;
		}
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = {11,18,6,9,8,2,7};
		
		System.out.println("----------Before Sorted----------");
		for (int i : arr) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		
		Selection_Sort(arr);
		
		System.out.println("----------After Sorted----------");
		for (int i : arr) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
	
}
