package cn.yang.sort;
/**
 * ѡ�������㷨
 * ʱ�临�Ӷȣ���������T(n) = O(n2)  ��������T(n) = O(n2)  ƽ�������T(n) = O(n2)
 * �㷨˼�룺
 * 1��������δ�����������ҵ���С����Ԫ�أ���ŵ��������е���ʼλ�ã�
 * 2��Ȼ���ٴ�ʣ��δ����Ԫ���м���Ѱ����С����Ԫ�أ�Ȼ��ŵ����������е�ĩβ��
 * 3���Դ����ƣ�ֱ������Ԫ�ؾ�������ϡ� 
 * @author liuyang
 * @date 2018��3��12������10:15:11
 */
public class SelectionSort {
	/**
	 * ѡ�������㷨�߼�
	 * @param a
	 */
	public static void selectSort(int[] a){
		int temp = 0;
		int flag = 0;
		for (int i = 0;i< a.length;i++){
			 temp = a[i];
			 flag = i;
			//ѭ�������±�i�����Ԫ����С��ֵ���±�
			for (int j=i+1;j<a.length;j++){
				if (a[j] < temp) {
					temp = a[j];
					flag = j;
				}
			}
			//���±�i���Աȣ������:�������ҵ���tempֵС��,��i���н���
			if (flag!=i){
				a[flag] = a[i];
				a[i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,2,7,5,3,1,6,9,8,0};
		//���������㷨�����ô���
		selectSort(a);
		for (int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}

	}

}
