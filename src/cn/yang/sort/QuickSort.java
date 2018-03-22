package cn.yang.sort;
/**
 * 快速排序算法
 * 时间复杂度：最佳情况：T(n) = O(nlogn)   最差情况：T(n) = O(n2)   平均情况：T(n) = O(nlogn)　
 * 算法思想：
 * 1、选择基准元素，通常选择第一个或最后一个元素
 * 2、重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。
 *   在这个分区退出之后，该基准就处于数列的中间位置。这个称为分区（partition）操作
 * 3、递归地（recursive）把小于基准值元素的子数列和大于基准值元素的子数列排序。
 * 
 * @Description: TODO
 * @author liuyang
 * @date 2018年3月22日
 */
public class QuickSort {
	/**
	 * 快速排序
	 * @param a
	 * @param start
	 * @param end   
	 */
	public static void quickSort(int a[],int start,int end){
		if (start<end){
			int baseNum = a[start]; //选取基准元素
			int middle ;			//中轴位置，即一次排序后基准元素所在的位置
			int i = start;
			int j = end;
			//1、分区，查出中轴位置
			while(i<j){
				while(a[j]>baseNum && i<j){	//右侧开始遍历，比基准值大，j--,继续遍历
					j--;
				}
				a[i] = a[j]; //小的值放入基准值的位置上,交换后可看作基准值在j位置上
				while(a[i]<baseNum && i<j){ //左侧开始遍历,比基准值小，i++，继续遍历
					i++;
				}
				a[j] = a[i];   //大的值放入基准位置上，交换后可看作基准值在i位置上
			}
			middle = i;	//中轴位置=i=j
			a[middle] = baseNum;//将基准值放入中间位置middle上
			
			//2、递归将分别将左侧数组和右侧数组排序
			if (middle-1>start){
				quickSort(a, start, middle-1);;
			}
			if (middle+1<end){
				quickSort(a, middle+1, end);
			}
			
		}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,2,7,5,3,1,6,9,8,0};
		quickSort(a,0,a.length-1);
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}
