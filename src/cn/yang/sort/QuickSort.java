package cn.yang.sort;
/**
 * ���������㷨
 * ʱ�临�Ӷȣ���������T(n) = O(nlogn)   ��������T(n) = O(n2)   ƽ�������T(n) = O(nlogn)��
 * �㷨˼�룺
 * 1��ѡ���׼Ԫ�أ�ͨ��ѡ���һ�������һ��Ԫ��
 * 2�������������У�����Ԫ�رȻ�׼ֵС�İڷ��ڻ�׼ǰ�棬����Ԫ�رȻ�׼ֵ��İ��ڻ�׼�ĺ��棨��ͬ�������Ե���һ�ߣ���
 *   ����������˳�֮�󣬸û�׼�ʹ������е��м�λ�á������Ϊ������partition������
 * 3���ݹ�أ�recursive����С�ڻ�׼ֵԪ�ص������кʹ��ڻ�׼ֵԪ�ص�����������
 * 
 * @Description: TODO
 * @author liuyang
 * @date 2018��3��22��
 */
public class QuickSort {
	/**
	 * ��������
	 * @param a
	 * @param start
	 * @param end   
	 */
	public static void quickSort(int a[],int start,int end){
		if (start<end){
			int baseNum = a[start]; //ѡȡ��׼Ԫ��
			int middle ;			//����λ�ã���һ��������׼Ԫ�����ڵ�λ��
			int i = start;
			int j = end;
			//1���������������λ��
			while(i<j){
				while(a[j]>baseNum && i<j){	//�Ҳ࿪ʼ�������Ȼ�׼ֵ��j--,��������
					j--;
				}
				a[i] = a[j]; //С��ֵ�����׼ֵ��λ����,������ɿ�����׼ֵ��jλ����
				while(a[i]<baseNum && i<j){ //��࿪ʼ����,�Ȼ�׼ֵС��i++����������
					i++;
				}
				a[j] = a[i];   //���ֵ�����׼λ���ϣ�������ɿ�����׼ֵ��iλ����
			}
			middle = i;	//����λ��=i=j
			a[middle] = baseNum;//����׼ֵ�����м�λ��middle��
			
			//2���ݹ齫�ֱ����������Ҳ���������
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
