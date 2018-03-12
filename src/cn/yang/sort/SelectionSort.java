package cn.yang.sort;
/**
 * 选择排序算法
 * 
 * @author liuyang
 * @date 2018年3月12日下午10:15:11
 */
public class SelectionSort {
	/**
	 * 选择排序算法逻辑
	 * @param a
	 */
	public static void selectSort(int[] a){
		int temp = 0;
		int flag = 0;
		for (int i = 0;i< a.length;i++){
			 temp = a[i];
			 flag = i;
			//循环查找下标i后面的元素最小的值和下标
			for (int j=i+1;j<a.length;j++){
				if (a[j] < temp) {
					temp = a[j];
					flag = j;
				}
			}
			//和下标i做对比，不相等:后续查找到比temp值小的,与i进行交换
			if (flag!=i){
				a[flag] = a[i];
				a[i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,2,7,5,3,1,6,9,8,0};
		//调用排序算法，引用传参
		selectSort(a);
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}

	}

}
