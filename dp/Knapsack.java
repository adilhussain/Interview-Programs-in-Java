package dp;

public class Knapsack {
	
	public static void main(String[] args) {
		int val[] = {22, 20, 15, 30, 24, 54, 21, 32, 18, 25};
        int wt[] = {4, 2, 3, 5, 5, 6, 9, 7, 8, 10};
        solveKnapsack(val, wt, 30);
	}
	public static void solveKnapsack(int itemValues[],int weights[],int MaxWeight){
		int[][] temp = new int[itemValues.length+1][MaxWeight+1];
		for(int i = 0; i <= itemValues.length;i++){
			for(int j = 0; j <= MaxWeight;j++){
				if(i == 0 || j == 0){
					temp[i][j] = 0;
					continue;
				}
				if(j - weights[i - 1] >=0){
					temp[i][j] = Math.max(temp[i-1][j], itemValues[i-1] + temp[i-1][j - weights[i-1]]);
				}else{
					temp[i][j] = temp[i-1][j];
				}
			}
		}
		System.out.println(temp[itemValues.length][MaxWeight]);
	}
}
