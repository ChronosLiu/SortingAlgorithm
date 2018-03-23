package cn.yang.sort;
/**
 * ϣ������
 * ʱ�临�Ӷȣ���������T(n) = O(nlog2 n)  ������T(n) = O(nlog2 n)  ƽ�������T(n) =O(nlog n)��
 * �㷨˼�룺
 * 1��ѡ��һ����������t1��t2������tk������ti>tj��tk=1��
 * 2�����������и���k�������н���k ������
 * 3��ÿ�����򣬸��ݶ�Ӧ������ti�����������зָ�����ɳ���Ϊm �������У��ֱ�Ը��ӱ����ֱ�Ӳ�������
 *   ����������Ϊ1 ʱ������������Ϊһ�������������ȼ�Ϊ�������еĳ��ȡ�
 *   
 * @Description: TODO
 * @author liuyang
 * @date 2018��3��23��
 */
public class ShellSort {

	/**
	 * ϣ�������㷨ʵ��
	 * @Description:TODO
	 * @param a   
	 */
	public static void shellSort(int[] a){
		//����incream ѭ��
		for (int incream = a.length/2;incream>0;incream=incream/2){
			int j ;
			int temp; //��ʱ����
			//����Ϊincream,ѭ�����飬��incream���꿪ʼ������ֵ����ǰ����ж�Ӧ��
			for(int i = incream;i<a.length;i++){
				temp = a[i];
				//jΪincream�±��Ӧ��ֵ��ѭ��������j-incream ��j��Ӧ
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
