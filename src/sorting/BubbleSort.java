package sorting;

public class BubbleSort {
	void sort(int arr[]) {
		int a =  arr.length;
		for(int i =0;i<a;i++) {
			for(int j=0;j<a-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		BubbleSort bs= new BubbleSort();
		int[] arr={11,5,2,6,7,4};
		bs.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
