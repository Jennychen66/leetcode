package leetcode136;

public class Solutions {
	public static void main(String[] args){
		System.out.println("this is my first java project");
		Solutions ms = new Solutions();
		ms.test();
		int []input = {1,2,3,4,3,2,1,8,10,10,8,0,12,34,56,56,34,4,0};
		System.out.println( ms.SingleNumber(input) );
		
	}
	public void test(){
		System.out.println("�ҵĵ�һ������");
	}
	
	// OR ^ ,the same to be 0; not both the same to be 1 
	// ������������: ˼·2����������������������1��������a ^ b = b ^ a������2��0 ^ a = a���������ý����ɿ��Խ�����������ͬԪ��ȫ�����ڣ����ǽ�����Ԫ������������������ͬԪ�����Ϊ0������ʣ�µ�Ԫ�ؾ�ΪSingle Number��ʱ�临�Ӷ�O(n)���ռ临�Ӷ�O(1)
	public int SingleNumber(int[] nums){ 
		int tmp = 0;
		for (int i = 0; i< nums.length; i++){
			tmp ^=  nums[i];
		}
		
		return tmp;
		
	}

}
