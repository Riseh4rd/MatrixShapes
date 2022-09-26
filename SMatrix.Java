ackage Practice1.Matrix;

import java.util.Random;

public class Matrix {
	private int height;
	private int width;
	private int[][] matrix;

	public Matrix(int size){
		this.height = size;
		this.width = size;
		this.matrix = new int[size][size];
		Random r = new Random();

		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.width; j++) {
				this.matrix[i][j] = r.nextInt(10);
			}
		}
	}

	public int[][] getMatrix(){
		return this.matrix;
	}

	public void showMatrix(){
		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.width; j++) {
				System.out.print(this.matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void addMatrix(Matrix matrix2){
		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.width; j++) {
				this.matrix[i][j] += matrix2.getMatrix()[i][j];
			}
		}
	}

	public void numberMultiply(int number){
		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.width; j++) {
				this.matrix[i][j] *= number;
			}
		}
	}

	public void matrixMultiply(Matrix matrix2){
		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.width; j++) {
				this.matrix[i][j] *= matrix2.getMatrix()[i][j];
			}
		}
	}
}
