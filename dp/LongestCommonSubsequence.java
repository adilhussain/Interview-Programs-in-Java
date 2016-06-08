package dp;

public class LongestCommonSubsequence {
	
		public static void main(String[] args) {
			System.out.println(solveLCS("gfdgBANANA", "ANAPANA"));
			System.out.println(solveLCSDynamic("gfdgBANANA".toCharArray(), "ANAPANA".toCharArray()));
		}
		public static int solveLCS(String str1,String str2){
			return solveUtil(str1.toCharArray(),str2.toCharArray(),0,0);
		}

		private static int solveUtil(char[] str1, char[] str2, int length,
				int length2) {
			if(str1.length == length || str2.length == length2)
				return 0;
			if(str1[length] == str2[length2]){
				return 1+solveUtil(str1,str2,length+1,length2+1);
			}else{
				return Math.max(solveUtil(str1,str2,length+1,length2),
						solveUtil(str1,str2,length,length2+1));
			}
			
		}
		
		public static int solveLCSDynamic(char[] str1, char[] str2){
			int[][] temp = new int[str1.length + 1][str2.length + 1];
			int max = 0;
			for(int  i = 1; i< temp.length;i++){
				for(int j = 1;j<temp[0].length;j++){
					if(str1[i-1] == str2[j-1]){
						temp[i][j] = 1 + temp[i-1][j-1];
					}else{
						temp[i][j] = Math.max(temp[i-1][j],temp[i][j-1]);
					}
					if(max < temp[i][j]){
						max = temp[i][j];
					}
				}
			}
			return max;
		}

		
}
