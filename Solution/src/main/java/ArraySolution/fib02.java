package ArraySolution;

/**
 * @author Albert
 * @date 2020/5/19 - 8:02 下午
 */
public class fib02 {
    public static void main(String[] args) {
    }
    int[][] matrixPow (int[][] m, int n) {
        int[][] res = new int[][] {{1,0},{1,1}};
        while (n>0) {
            if ((n&1) ==1) {
                res=matrixMul(res,m);
            }
            n>>=1;
            m=matrixMul(m,m);
        }
        return res;
    }

    private int[][] matrixMul(int[][] res, int[][] m) {
        return new int[0][];
    }
}
