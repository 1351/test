package github;

/**
 * 找出一个整数数组中子数组之和的最大值。
 * @author IRON_MAN
 * 
 */
public class MaxChildArg {

	public static void main(String[] args) {
		int[] date = {10,-1,2,3,4,-6,-5};
		int max = date[0];
		int sum = 0 ;
		int start=0,end=0;
		for(int i =0;i<date.length;i++){
			for(int j=i;j<date.length;j++){
				sum+=date[j];
				if(sum>max){
					max = sum;
					start = i;
					end = j;
				}
			}
			sum = 0;
		}
		//输出子数组的数组之和最大的数组成员
		System.out.print("子数组之和最大的子数组：[");
		for(int i = start ;i<(end-start+1);i++){
			System.out.print(date[i]+" ");
		}
		System.out.println("]");
		//输出子数组之和最大的数组之和
		System.out.println("最大子数组之和为："+max);
	}
}
