package github;

/**
 * �ҳ�һ������������������֮�͵����ֵ��
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
		//��������������֮�����������Ա
		System.out.print("������֮�����������飺[");
		for(int i = start ;i<(end-start+1);i++){
			System.out.print(date[i]+" ");
		}
		System.out.println("]");
		//���������֮����������֮��
		System.out.println("���������֮��Ϊ��"+max);
	}
}
