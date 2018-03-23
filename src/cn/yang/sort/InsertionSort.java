package cn.yang.sort;
/**
 * 插入排序算法
 * 时间复杂度：最佳情况：T(n) = O(n)   最坏情况：T(n) = O(n2)   平均情况：T(n) = O(n2)
 * 算法思想：
 * 1、从第一个元素开始，该元素可以认为已经被排序；
 * 2、取出下一个元素，在已经排序的元素序列中从后向前扫描；
 * 3、如果该元素（已排序）大于新元素，将该元素移到下一位置；
 * 4、重复步骤3，直到找到已排序的元素小于或者等于新元素的位置；
 * 5、将新元素插入到该位置后；
 * 6、重复步骤2~5
 * @author liuyang
 * @date 2018年3月13日下午10:29:08
 */
public class InsertionSort {
	/**
	 * 插入排序算法逻辑
	 * @param a
	 */
	public static void insertSort(int[] a){
		
		for(int i=1;i<a.length;i++){
			int temp = a[i];
			int j =i;
			//当前值与下标i前面的比较，当前记录小区其之前的记录，移动之前记录到当前位置，继续比较
			while(j>=1 && a[j-1]>temp){
				a[j]=a[j-1];
				j--;
			}
			a[j] = temp;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,2,7,5,3,1,6,9,8,0};
		insertSort(a);
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}
