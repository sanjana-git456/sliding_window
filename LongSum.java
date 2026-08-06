
public class LongSum {

    public int longest(int[] x, int k) {
        int left = 0;
        int ans = 0;
        int s = 0;
        for (int right = 0; right < x.length; right++) {
            s += x[right];
            while (s > k) {
                s = s - x[left] + x[right];
                left++;
            }
            ans = Math.max(ans, s);
        }
        return ans;
    }

    public static void main(String[] args) {
        LongSum ls = new LongSum();
        int[] arr = {3, 1, 2, 1, 4, 2};
        int k = 5;
        System.out.println(ls.longest(arr, k));
    }
}
