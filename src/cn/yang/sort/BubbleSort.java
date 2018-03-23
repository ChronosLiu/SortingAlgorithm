package cn.yang.sort;
/**
 * ð�������㷨
 * ʱ�临�Ӷȣ���������T(n) = O(n)   ��������T(n) = O(n2)   ƽ�������T(n) = O(n2)
 * �㷨˼�룺
 * 1���Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
 * 2����ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԣ�����������Ԫ��Ӧ�û�����������
 * 3��������е�Ԫ���ظ����ϵĲ��裬�������һ����
 * 4���ظ�����1~3��ֱ��������ɡ�
 * @author liuyang
 * @date 2018��3��13������10:46:42
 */
public class BubbleSort {

	/**
	 * ð�������㷨�߼�
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
