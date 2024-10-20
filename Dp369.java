public class Dp369 {

    public static int maxPoints(int[] a, int n, int i, int count) {
        // if (i == n - 1) {
        //     return 0; 
        // }

        if (i >= n) {
            return 0;
        }
        int pick=0;
        int npick=0;

        if (count % 2 == 0) {

            if (i < n) {
                pick =  a[i] + maxPoints(a, n, i + 1, count+1);

                npick = 0 + maxPoints(a, n, i + 1, count);

            }
        } else {
            if (i < n) {
                pick =2* a[i] + maxPoints(a, n, i + 1, count+1);

                npick = 0 + maxPoints(a, n, i + 1, count);

            }
        }
        // Return the minimum of both options

        return Math.max(pick, npick);
    }

    public static void main(String[] args) {
        int a[] = { 1, 5, 3, 2, 7 };
        int ans = maxPoints(a, 5, 0, 0);
        System.out.println("Minimum cost: " + ans);
    }

}
