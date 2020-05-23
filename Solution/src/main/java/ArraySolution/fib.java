package ArraySolution;

/**
 * @author Albert
 * @date 2020/5/19 - 7:53 下午
 */
public class fib {
    public static void main(String[] args) {
    }

    public int fib(int n) {
        if (n <= 0) {
            return n;
        }
        int[][] m = new int[][]{{1, 1}, {1, 0}};
        int[][] originM = new int[][]{{1}, {0}};
        int[][] res = matrixMul(matrixPow(m, n - 1), originM);
        return res[0][0];
    }

    private int[][] matrixPow(int[][] m, int i) {
        return new int[0][];
    }

    int[][] matrixMul(int[][] a, int[][] b) {
        int row = a.length;
        int col = b[0].length;
        int[][] res = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int k = 0; k < b.length; k++) {
                for (int j = 0; j < col; j++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return res;
    }
}