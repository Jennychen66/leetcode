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
		System.out.println("我的第一个方法");
	}
	// 本题目的意思就是在一个矩形网格区域中已经有相应的island , 该island的铺设方式有一定的要求,但是在比本题目中只需要关心已经铺好island的矩形区域的周长是多少,并不需要判断应该如何铺路
	public int islandPerimeter(int[][] grid) {
		int length= grid[0].length; // 这个是宽度 2
		int width = grid.length; //这个是长度,不要弄错了1
		int perim = 0; // 初始化周长
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
	// 把一个一维数组中的所有元素判断是否跟num 相等,如果相等则把它替换成changeNum,最后返回的就是Change 之后的list ,还有替换的数量
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
