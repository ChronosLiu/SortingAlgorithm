package cn.yang.sort;
/**
 * ������
 * ʱ�临�Ӷȣ���������T(n) = O(nlogn)   ��������T(n) = O(nlogn)   ƽ�������T(n) = O(nlogn)
 * �㷨˼�룺
 * 1�������ʼ�ѡ��������������й����һ���󶥶ѣ�һ��������ô󶥶ѣ��������С����)��
 * 2�����Ѷ�Ԫ����ĩβԪ�ؽ��н�����ʹĩβԪ�����Ȼ����������ѣ��ٽ��Ѷ�Ԫ����ĩβԪ�ؽ������õ��ڶ���Ԫ�ء�
 * 3����˷������н������ؽ���������
 * 
 * @author liuyang
 * @date 2018��3��23������10:44:29
 */
public class HeapSort {
	
	/**
	 * �����������󶥶�
	 * @param a
	 * @param i
	 * @param length
	 */
	public static void adjustMaxHeap(int[] a,int i,int length){
		int temp = a[i]; //��ǰԪ��
		for (int k = 2*i+1;k<length;k=2*k+1){ //��i�ڵ���ӽ�㿪ʼ��2i+1 ����
			
			if (k+1<length && a[k]<a[k+1]){ //����С���ҽ�㣬kָ���ҽ��
				k=k+1;
			}
			if (a[k]>temp){ // �ӽ����ڸ���㣬����
				a[i] = a[k];
				i=k;
			} else {
				break;
			}
		}
		a[i] = temp;
	}
	/**
	 * ����������С����
	 * @param a
	 * @param i
	 * @param length
	 */
	public static void adjustMinHeap(int[] a,int i,int length){
		
		int temp = a[i]; //��ǰԪ��
		for (int k = 2*i+1;k<length;k=2*k+1){ //��i�ڵ���ӽ�㿪ʼ��2i+1 ����
			
			if (k+1<length && a[k]>a[k+1]){ //��������ҽ�㣬kָ���ҽ��
				k=k+1;
			}
			if (a[k]<temp){ // �ӽ��С�ڸ���㣬����
				a[i] = a[k];
				i=k;
			} else {
				break;
			}
		}
		a[i] = temp;
	}
	/**
	 * �󶥶����� ������
	 * @param a
	 */
	public static void maxHeapSort(int[] a){
		
		//1�������󶥶�
		for(int i = a.length/2-1;i>=0;i--){
			//�ӵ�һ����Ҷ�ӽ��������ϣ�������������ṹ
			adjustMaxHeap(a, i, a.length);
		}
		for(int j= a.length-1;j>=0;j--){
			//����������Ԫ�غ����һ��Ԫ�ؽ���
			swap(a, 0, j);
			//���½��е�����
			adjustMaxHeap(a, 0, j-1);
		}
	}
	/**
	 * С�������򣬽���
	 * @param a
	 */
	public static void minHeapSort(int[] a){
		//1�������󶥶�
		for(int i = a.length/2-1;i>=0;i--){
			//�ӵ�һ����Ҷ�ӽ��������ϣ�������������ṹ
			adjustMinHeap(a, i, a.length);
		}
		for(int j= a.length-1;j>=0;j--){
			//����������Ԫ�غ����һ��Ԫ�ؽ���
			swap(a, 0, j);
			//���½��е�����
			adjustMinHeap(a, 0, j-1);
		}
	}
	/**
	 * ����Ԫ��
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
		//�󶥶�����
		int[] a = {4,2,7,5,3,1,6,9,8,0};
		maxHeapSort(a);
		System.out.print("�󶥶�����");
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		//С��������
		int[] b = {4,2,7,5,3,1,6,9,8,0};
		minHeapSort(b);
		System.out.print("С���ѽ���");
		for (int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");
		}
	}

}
