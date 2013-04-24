package pl.dstankiew.test;

public class Grafy {
	public static void main(String[] args) {
		int a[][] = new int[][] { 
				{ 0, 12, 0, 5, 0, 0 }, 
				{ 0, 0, 11, 10, 0, 3 }, 
				{ 0, 0, 0, 0, 6, 0 }, 
				{ 0, 0, 0, 0, 2, 0 },
				{ 0, 7, 0, 4, 0, 0 }, 
				{ 0, 0, 7, 6, 10, 0 } };

		printTable(a);
		
		System.out.println("---");
		for (int k = 0; k < 6; k++) {
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					int ikj = a[i][k] == 0 || a[k][j] == 0 ? Integer.MAX_VALUE : a[i][k] + a[k][j];
					if (a[i][j] > ikj) {
						a[i][j] = ikj;
					}
				}
			}
		}

		printTable(a);
	}

	private static void printTable(int[][] a) {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.printf("%d, ", a[i][j]);
			}
			System.out.println();
		}
	}
}
