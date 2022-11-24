package assignments;

public class MatricesSum {
	public static void main(String[] args) {
		
		int[][] matrix1 = {{1, 2}, {2, 1}};
		int[][] matrix2 = {{3, 4}, {4, 3}};
		
		int sum[][] = new int[2][2];
		int i;
		int j;
		
		for(i = 0; i < matrix1.length; i++) {
			for(j = 0; j < matrix1[0].length; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		for(i = 0; i < sum.length; i++) {
			for(j = 0; j < sum[0].length; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
}
