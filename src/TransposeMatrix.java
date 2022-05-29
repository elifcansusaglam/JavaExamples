import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6}};
        int newMatrix[][]=new int[matrix[0].length][matrix.length];

        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j< matrix.length;j++){
                newMatrix[i][j]=matrix[j][i];
            }
        }
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
