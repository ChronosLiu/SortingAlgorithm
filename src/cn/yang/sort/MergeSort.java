package cn.yang.sort;
/**
 * 归并排序算法
 * 时间复杂度：最佳情况：T(n) = O(n)  最差情况：T(n) = O(nlogn)  平均情况：T(n) = O(nlogn)
 * 算法思想：
 * 1、把长度为n的输入序列分成两个长度为n/2的子序列；
 * 2、对这两个子序列分别采用归并排序；
 * 3、将两个排序好的子序列合并成一个最终的排序序列。
 * @author liuyang
 * @date 2018年3月18日下午8:13:28
 */
public class MergeSort {

	/**
	 * 归并排序算法
	 * 1、拆分，将一个数组拆分
	 * @param a
	 */
	public static void mergeSort(int a[],int begin,int end){
		if (begin<end){
			int mid = (begin+end)/2;
			mergeSort(a,begin,mid); //拆分左半数组
			mergeSort(a,mid+1,end); //拆分右半数组
			merge(a,begin,mid,end); //将2个有序数组合并
		}
	}
	/**
	 * 2、合并，将2个有序数组合并
	 * @param a
	 * @param begin
	 * @param mid
	 * @param end
	 */
	public static void merge(int a[],int begin,int mid,int end){
		
		int[] left = new int[mid-begin+1];	//左
		int[] right = new int[end-mid];		//右
		//从a数组中获取左数组
		for (int i=0,j=begin;i<left.length;i++,j++){
			left[i] = a[j];
		}
		//右数组
		for (int i=0,j=mid+1;i<right.length;i++,j++){
			right[i] = a[j];
		}
		int i=0,j=0,k=0;
		//将2个有序数组合并
		for(i=0,j=0,k=begin;i<left.length&&j<right.length;k++){
			//左数组的值大于右数组，将右数组放入a数组中，右数组下标+1
			if (left[i]>right[j]){
				a[k] = right[j];
				j++;
			} else {
				a[k] = left[i];
				i++;
			}
//			a[k]=left[i]>right[j]?right[j]:left[i];
		}
		//左数组有剩余
		if (i<left.length){
			for (;i<left.length;i++,k++){
				a[k]=left[i];
			}
		}
		//右数组有剩余
		if (j<right.length){
			for (;j<right.length;j++,k++){
				a[k] = right[j];
			}
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,2,7,5,3,1,6,9,8,0};
		mergeSort(a,0,a.length-1);
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}
