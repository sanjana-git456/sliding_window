
public class MaxSum {

    public int msum(int[] x, int k) {
        int left = 0;
        int right = k - 1;
        int s = 0;
        int ans = s;
        for (int i = 0; i <= k - 1; i++) {
            s += x[i];
        }
        while (right + 1 < x.length) {
            right += 1;
            s = s - x[left] + x[right];
            left += 1;
            ans = Math.max(ans, s);
        }
        return ans;
    }

    public static void main(String[] args) {
        MaxSum ms = new MaxSum();
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 2;
        System.out.println(ms.msum(arr, k));
    }
}
