package cn.yang.sort;
/**
 * 冒泡排序算法
 * 时间复杂度：最佳情况：T(n) = O(n)   最差情况：T(n) = O(n2)   平均情况：T(n) = O(n2)
 * 算法思想：
 * 1、比较相邻的元素。如果第一个比第二个大，就交换它们两个；
 * 2、对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
 * 3、针对所有的元素重复以上的步骤，除了最后一个；
 * 4、重复步骤1~3，直到排序完成。
 * @author liuyang
 * @date 2018年3月13日下午10:46:42
 */
public class BubbleSort {

	/**
	 * 冒泡排序算法逻辑
	 * @param a
	 */
	public static void bubbleSort(int[] a){
		
		for(int i=0;i<a.length-1;i++){
			
			for (int j=a.length-1;j>i;j--){
				if (a[i]> a[j]){
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,2,7,5,3,1,6,9,8,0};
		bubbleSort(a);
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}
