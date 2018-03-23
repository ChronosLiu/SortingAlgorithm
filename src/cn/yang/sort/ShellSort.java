package cn.yang.sort;
/**
 * 希尔排序
 * 时间复杂度：最佳情况：T(n) = O(nlog2 n)  最坏情况：T(n) = O(nlog2 n)  平均情况：T(n) =O(nlog n)　
 * 算法思想：
 * 1、选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
 * 2、按增量序列个数k，对序列进行k 趟排序；
 * 3、每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。
 *   仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 *   
 * @Description: TODO
 * @author liuyang
 * @date 2018年3月23日
 */
public class ShellSort {

	/**
	 * 希尔排序算法实现
	 * @Description:TODO
	 * @param a   
	 */
	public static void shellSort(int[] a){
		//增量incream 循环
		for (int incream = a.length/2;incream>0;incream=incream/2){
			int j ;
			int temp; //临时变量
			//增量为incream,循环数组，从incream坐标开始，后续值都与前面的有对应。
			for(int i = incream;i<a.length;i++){
				temp = a[i];
				//j为incream下标对应的值，循环遍历，j-incream 和j对应
				for ( j = i-incream;j>=0 ;j=j-incream){
					if (a[j]>temp){ //
						a[j+incream] = a[j];
					} else {
						break;
					}
				}
				a[j+incream] = temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,2,7,5,3,1,6,9,8,0};
		shellSort(a);
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

}
