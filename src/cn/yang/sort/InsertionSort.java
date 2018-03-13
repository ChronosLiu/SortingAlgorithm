package cn.yang.sort;
/**
 * 插入排序算法
 * 
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
