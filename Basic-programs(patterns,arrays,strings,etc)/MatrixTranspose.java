package basic;

import java.util.Scanner;

public class MatrixTranspose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int count = 0;
		System.out.println("Enter Elements");
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
