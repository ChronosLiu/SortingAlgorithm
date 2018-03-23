package cn.yang.sort;
/**
 * �鲢�����㷨
 * ʱ�临�Ӷȣ���������T(n) = O(n)  ��������T(n) = O(nlogn)  ƽ�������T(n) = O(nlogn)
 * �㷨˼�룺
 * 1���ѳ���Ϊn���������зֳ���������Ϊn/2�������У�
 * 2���������������зֱ���ù鲢����
 * 3������������õ������кϲ���һ�����յ��������С�
 * @author liuyang
 * @date 2018��3��18������8:13:28
 */
public class MergeSort {

	/**
	 * �鲢�����㷨
	 * 1����֣���һ��������
	 * @param a
	 */
	public static void mergeSort(int a[],int begin,int end){
		if (begin<end){
			int mid = (begin+end)/2;
			mergeSort(a,begin,mid); //����������
			mergeSort(a,mid+1,end); //����Ұ�����
			merge(a,begin,mid,end); //��2����������ϲ�
		}
	}
	/**
	 * 2���ϲ�����2����������ϲ�
	 * @param a
	 * @param begin
	 * @param mid
	 * @param end
	 */
	public static void merge(int a[],int begin,int mid,int end){
		
		int[] left = new int[mid-begin+1];	//��
		int[] right = new int[end-mid];		//��
		//��a�����л�ȡ������
		for (int i=0,j=begin;i<left.length;i++,j++){
			left[i] = a[j];
		}
		//������
		for (int i=0,j=mid+1;i<right.length;i++,j++){
			right[i] = a[j];
		}
		int i=0,j=0,k=0;
		//��2����������ϲ�
		for(i=0,j=0,k=begin;i<left.length&&j<right.length;k++){
			//�������ֵ���������飬�����������a�����У��������±�+1
			if (left[i]>right[j]){
				a[k] = right[j];
				j++;
			} else {
				a[k] = left[i];
				i++;
			}
//			a[k]=left[i]>right[j]?right[j]:left[i];
		}
		//��������ʣ��
		if (i<left.length){
			for (;i<left.length;i++,k++){
				a[k]=left[i];
			}
		}
		//��������ʣ��
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
