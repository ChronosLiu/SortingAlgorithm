package cn.yang.sort;
/**
 * ���������㷨
 * 
 * @author liuyang
 * @date 2018��3��13������10:29:08
 */
public class InsertionSort {
	/**
	 * ���������㷨�߼�
	 * @param a
	 */
	public static void insertSort(int[] a){
		
		for(int i=1;i<a.length;i++){
			int temp = a[i];
			int j =i;
			//��ǰֵ���±�iǰ��ıȽϣ���ǰ��¼С����֮ǰ�ļ�¼���ƶ�֮ǰ��¼����ǰλ�ã������Ƚ�
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
