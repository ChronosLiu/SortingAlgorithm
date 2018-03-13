package cn.yang.sort;
/**
 * Ã°ÅİÅÅĞòËã·¨
 * 
 * @author liuyang
 * @date 2018Äê3ÔÂ13ÈÕÏÂÎç10:46:42
 */
public class BubbleSort {

	/**
	 * Ã°ÅİÅÅĞòËã·¨Âß¼­
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
