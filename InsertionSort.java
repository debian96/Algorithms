class Insertion {

	public static void Insert_Sort(int A[]){
		
		int n = A.length;
		
		for (int i = 1; i < n; i++) {
			int key = A[i];
			int j = i-1;
			while(j>=0 && A[j]>key){
				A[j+1] = A[j];
				j = j-1;
			}
			A[j+1] = key;
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
		
		Insert_Sort(arr);
		
		System.out.println("----------After Sorted----------");
		for (int i : arr) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
	
}
