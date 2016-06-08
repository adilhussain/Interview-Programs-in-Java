package dp;

public class LIS {
	public static void main(String[] args) {
		int arr[] = {4,5,2,6,7,0,3,4,1,9};
		System.out.println(solveLIS(arr));
	}
	public static String solveLIS(int arr[]){
		
		
		int solutionArr[] = new int[arr.length];
		int actualSolution[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			solutionArr[i] = 1;
			actualSolution[i] = i;
		}
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[i]> arr[j]){
					if(solutionArr[j] + 1 > solutionArr[i]){
						solutionArr[i] = solutionArr[j]+1; 
						actualSolution[i] = j;
					}
				}
			}
		}
		int maxIndex = 0;
		for(int i = 0;i<solutionArr.length;i++){
			if(solutionArr[i]>solutionArr[maxIndex])
				maxIndex = i;
		}
		int t = maxIndex;
        int newT = maxIndex;
        do{
            t = newT;
            System.out.print(arr[t] + " "); 
            newT = actualSolution[t]; 
        }while(t != newT);
        System.out.println();
 
       
		
		return solutionArr[maxIndex]+"="+printArr(solutionArr)+"\n  "+printArr(arr);
	}
	private static String printArr(int[] solutionArr) {
		String s = "";
		for(int x:solutionArr)
			s+=x+" ";
		return s;
	}
}
