package sorting.com.gl;

public class MergeSort {
	
	public void sort(int[]array) {
		int size=array.length;
		if(size<2) {
			return;
		}
		int mid=size/2;
		int[]leftArray=new int[mid];
		int[]rightArray=new int[size-mid];
		
		for(int i=0;i<mid;i++) {
			leftArray[i]=array[i];
		}
		for(int i=mid;i<size;i++) {
			rightArray[i-mid]=array[i];
		}
		sort(leftArray);
		sort(rightArray);
		merge(array,leftArray,rightArray);
		
	}
	
	private void merge(int[]array,int leftArray[],int rightArray[]) {
		int sizeOfLeft=leftArray.length;
		int sizeOfRight=rightArray.length;
		
		int i=0,j=0,k=0;
		while(i<sizeOfLeft && j<sizeOfRight) {
			if(leftArray[i]>=rightArray[j]) {
				array[k]=leftArray[i];
				i++;
			}
			else {
				array[k]=rightArray[j];
				j++;
			}
			k++;			
		}
		while(i<sizeOfLeft) {
			array[k]=leftArray[i];
			i++;k++;
		}
		while (j<sizeOfRight) {
			array[k]=rightArray[j];
			j++;k++;
		
	}

}
}
