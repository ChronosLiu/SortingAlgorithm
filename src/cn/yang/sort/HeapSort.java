package cn.yang.sort;
/**
 * 堆排序
 * 时间复杂度：最佳情况：T(n) = O(nlogn)   最差情况：T(n) = O(nlogn)   平均情况：T(n) = O(nlogn)
 * 算法思想：
 * 1、构造初始堆。将给定无序序列构造成一个大顶堆（一般升序采用大顶堆，降序采用小顶堆)。
 * 2、将堆顶元素与末尾元素进行交换，使末尾元素最大。然后继续调整堆，再将堆顶元素与末尾元素交换，得到第二大元素。
 * 3、如此反复进行交换、重建、交换。
 * 
 * @author liuyang
 * @date 2018年3月23日下午10:44:29
 */
public class HeapSort {
	
	/**
	 * 调整，创建大顶堆
	 * @param a
	 * @param i
	 * @param length
	 */
	public static void adjustMaxHeap(int[] a,int i,int length){
		int temp = a[i]; //当前元素
		for (int k = 2*i+1;k<length;k=2*k+1){ //从i节点的子结点开始，2i+1 左结点
			
			if (k+1<length && a[k]<a[k+1]){ //左结点小于右结点，k指向右结点
				k=k+1;
			}
			if (a[k]>temp){ // 子结点大于根结点，交换
				a[i] = a[k];
				i=k;
			} else {
				break;
			}
		}
		a[i] = temp;
	}
	/**
	 * 调整，创建小顶堆
	 * @param a
	 * @param i
	 * @param length
	 */
	public static void adjustMinHeap(int[] a,int i,int length){
		
		int temp = a[i]; //当前元素
		for (int k = 2*i+1;k<length;k=2*k+1){ //从i节点的子结点开始，2i+1 左结点
			
			if (k+1<length && a[k]>a[k+1]){ //左结点大于右结点，k指向右结点
				k=k+1;
			}
			if (a[k]<temp){ // 子结点小于根结点，交换
				a[i] = a[k];
				i=k;
			} else {
				break;
			}
		}
		a[i] = temp;
	}
	/**
	 * 大顶堆排序 ，升序
	 * @param a
	 */
	public static void maxHeapSort(int[] a){
		
		//1、构建大顶堆
		for(int i = a.length/2-1;i>=0;i--){
			//从第一个非叶子结点从下至上，从右至左调整结构
			adjustMaxHeap(a, i, a.length);
		}
		for(int j= a.length-1;j>=0;j--){
			//交换，顶点元素和最后一个元素交换
			swap(a, 0, j);
			//重新进行调整堆
			adjustMaxHeap(a, 0, j-1);
		}
	}
	/**
	 * 小顶堆排序，降序
	 * @param a
	 */
	public static void minHeapSort(int[] a){
		//1、构建大顶堆
		for(int i = a.length/2-1;i>=0;i--){
			//从第一个非叶子结点从下至上，从右至左调整结构
			adjustMinHeap(a, i, a.length);
		}
		for(int j= a.length-1;j>=0;j--){
			//交换，顶点元素和最后一个元素交换
			swap(a, 0, j);
			//重新进行调整堆
			adjustMinHeap(a, 0, j-1);
		}
	}
	/**
	 * 交换元素
	 * @param a
	 * @param i
	 * @param j
	 */
	public static void swap(int[] a,int i,int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//大顶堆排序：
		int[] a = {4,2,7,5,3,1,6,9,8,0};
		maxHeapSort(a);
		System.out.print("大顶堆升序：");
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		//小顶堆排序：
		int[] b = {4,2,7,5,3,1,6,9,8,0};
		minHeapSort(b);
		System.out.print("小顶堆降序：");
		for (int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");
		}
	}

}
