
class Bubble {
	
	public static void Bubble_Sort(int A[]){
		
		int n = A.length;
		
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (A[j]>A[j+1]) {
					int temp = A[j+1];
					A[j+1] = A[j];
					A[j] = temp;
				}
			}
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
		
		Bubble_Sort(arr);
		
		System.out.println("----------After Sorted----------");
		for (int i : arr) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
	
}
