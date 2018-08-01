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
		System.out.println("我的第一个方法");
	}
	
	// OR ^ ,the same to be 0; not both the same to be 1 
	// 利用亦或的性质: 思路2：利用异或操作。异或的性质1：交换律a ^ b = b ^ a，性质2：0 ^ a = a。于是利用交换律可以将数组假想成相同元素全部相邻，于是将所有元素依次做异或操作，相同元素异或为0，最终剩下的元素就为Single Number。时间复杂度O(n)，空间复杂度O(1)
	public int SingleNumber(int[] nums){ 
		int tmp = 0;
		for (int i = 0; i< nums.length; i++){
			tmp ^=  nums[i];
		}
		
		return tmp;
		
	}

}
