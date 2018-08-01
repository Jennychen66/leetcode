package leetcode463;

import leetcode463.Solution;

public class Solution {
	public static void main(String[] args){
		System.out.println("this is about the leetcode island perimeter project");
		Solution ms = new Solution();
		ms.test();
		int []input = {1,2,3,4,3,2,1,8,10,10,8,0,12,34,56,56,34,4,0};
		//System.out.println( ms.SingleNumber(input) );
		int [][]arr = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		int [][]arr1 = {{1,0}};
		int result = ms.islandPerimeter(arr1);
		System.out.println(result);
		
	}
	public void test(){
		System.out.println("�ҵĵ�һ������");
	}
	// ����Ŀ����˼������һ�����������������Ѿ�����Ӧ��island , ��island�����跽ʽ��һ����Ҫ��,�����ڱȱ���Ŀ��ֻ��Ҫ�����Ѿ��̺�island�ľ���������ܳ��Ƕ���,������Ҫ�ж�Ӧ�������·
	public int islandPerimeter(int[][] grid) {
		int length= grid[0].length; // ����ǿ�� 2
		int width = grid.length; //����ǳ���,��ҪŪ����1
		int perim = 0; // ��ʼ���ܳ�
		for(int j=0; j<length; j++){
				for(int i = 0; i < width; i++){
					if(grid[i][j] == 1){
						perim += 4;
						if(j!=0 && grid[i][j-1] == 1){
							perim -=2;
						}
						if(i!=0 && grid[i-1][j] == 1){
							perim -=2;
						}
					}
					
				}
			}
			return perim;
	}
	// ��һ��һά�����е�����Ԫ���ж��Ƿ��num ���,������������滻��changeNum,��󷵻صľ���Change ֮���list ,�����滻������
	public Object findAllNumInArr(int []arr,int num, int changeNum){
		class Result {
			private int[] list;
			private int cont;
		}
		Result result = null;
		int len = arr.length;
		int count = 0;
		for(int i = 0;i < len;i++){
			if(arr[i] ==  num){
				arr[i] =changeNum;
				count++;
			}
		}
		result.list = arr;
		result.cont = count;
		return result;
	}

}
