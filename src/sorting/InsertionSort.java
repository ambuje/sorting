package sorting;

public class InsertionSort {
	void insertion(int arr[],int n) {
		int key , j;
		for(int i =1;i<n;i++) {
			key=arr[i];
			j=i-1;
			while (j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j]; 
				j = j-1; 
			}
			arr[j+1] = key;
			
		}
		
	}
	public static void main(String[] args) {
		InsertionSort is=new InsertionSort();
		int [] arr= {3,7,4,12,75,362};
		is.insertion(arr,arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
