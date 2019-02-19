package org.algorithm.quicksort;

public class SortAlg {

	public static void quickSort(int[] array,int low,int hight){
		int l = low;
		int h = hight;
		// boundary value
		int bv = array[low];
		
		while(l<h){
			while(l<h && array[h]>=bv)
				h--;
			/**
			 * 高位执行交换可保证高位不比 bv小，但是由于存在位置交换，
			 * 所以在 l++ ~ h 区间可能出现不比bv小的数。
			 * 例如
			 * 原数组：3，2，1，5，2，5，4
			 * 经过一遍高位换位之后数组变成 
			 *        2，2，1，5，3，5，4
			 * 3右边的数不小于3，但不是有序，给递归留下必要的证据，左边存在大于3的数       
			 */
			if(l<h){
				int temp = array[h];
				array[h] = array[l];
				array[l] = temp;
				l++;
			}
			while(l<h && array[l]<=bv)
				l++;
			if(l<h){
				int temp = array[l];
				array[l] = array[h];
				array[h] = temp;
				h--;
			}
		}
       if(l>low) quickSort(array,low,l-1);
       if(h<hight)quickSort(array,l+1,hight);
	}
	// 就是选出数组剩余元素中最大或者最小的元素进行排序
	public static void selectSort(int[] array){
		int len = array.length;
		int minIndex,temp;
		for(int i = 0; i < len - 1;i++ ){
			minIndex = i;
			for(int j = i+1; j < len ; j++){
				if(array[j] < array[minIndex]){
					minIndex = j;
				}
			}
			temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}
	// 将未排序的元素插入到已经排好序的“数组”中
	public static void insertSort(int[] array){
		int len = array.length;
		int preIndex,current;
		for(int i = 1;i < len;i++){
			preIndex = i-1;
			current = array[i];
			while(preIndex >=0 && array[preIndex] > current){
				array[preIndex + 1] = array[preIndex];
				preIndex --;
			}
			array[preIndex+1] = current;
		}
	}
	
	public static int[] mergeSort(int[] array){
		int len = array.length;
		if(len < 2){
			return array;
		}
		int middle = (int) Math.floor(len/2);
		int[] left = new int[middle+1];
		int[] right = new int[len - middle];
		System.arraycopy(array, 0, left, 0, middle+1);
		System.arraycopy(array, middle+1, right, 0, len - middle-1);
		
		return merge(mergeSort(left),mergeSort(right));
	}
	private static int[] merge(int[] left,int[] right){
		
		int[] result = new int[left.length+right.length];
		int leftIndex = 0;
		int rightIndex = 0;
		int resultIndex = 0;
		while(left.length > 0 && right.length > 0){
			if(left[leftIndex] <= right[rightIndex]){
				result[resultIndex++] = left[leftIndex++];
			}else{
				result[resultIndex++] = right[rightIndex++];
			}
		}
		while(leftIndex < left.length)
			result[resultIndex++] = left[leftIndex++];
		while(rightIndex < right.length)
			result[resultIndex++] = right[rightIndex++];
		return result;
	}
	public static void print(int[] array){
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i]+",");
		}
		System.out.println();
	}
	public static void main(String[] args){
		int[] array = {34,12,56,234,56,23,12,78,32,12,1,4,23,651,35,45,0,1,45,1};
		//int arrayLength = array.length;
		print(array);
		main(array.clone(),"quickSort");
		main(array.clone(),"selectSort");
		main(array.clone(),"insertSort");
		main(array.clone(),"mergeSort");
		
	}
	
	public static void main(int[] array,String sortMethod){
		switch(sortMethod){
			case "quickSort":
				quickSort(array,0,array.length-1);
				break;
			case "selectSort":
				selectSort(array);
				break;
			case "insertSort":
				insertSort(array);
				break;
			case "mergeSort":
				mergeSort(array);
				break;
			default:
				
		}
		print(array);
	}
}
