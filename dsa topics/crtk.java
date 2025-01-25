public class crtk {
    public static int minCost(int[] a, int n, int i) {
        // Base case: If we've reached the last element, return its value
        if (i == n - 1) {
            return 0; // No cost to stay on the last stone
        }
        
       
        if (i >= n) {
            return Integer.MAX_VALUE;
        }
        int jump1 = Integer.MAX_VALUE;
        // Calculate cost- for moving to the next stone
        if (i + 1 < n){
         jump1 = Math.abs(a[i] - a[i + 1]) + minCost(a, n, i + 1);
        }

        // Calculate cost for jumping two stones ahead (if within bounds)
        int jump2 = Integer.MAX_VALUE;
        if (i + 2 < n) {
            jump2 = Math.abs(a[i] - a[i + 2]) + minCost(a, n, i + 2);
        }

        // Return the minimum of both options
        return Math.min(jump1, jump2);
    }

    public static void main(String[] args) {
        int a[] = {10, 13, 14, 20, 17};
        int ans = minCost(a, 5, 0);
        System.out.println("Minimum cost: " + ans);
    }
}
