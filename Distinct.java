import java.util.*;
public class Distinct {
    public int dis(char[] x, int k) {
        int left = 0;
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < x.length; right++) {
            if (map.containsKey(x[right])) {
                map.put(x[right], map.get(x[right])+1);
            }
            else {
                map.put(x[right],1);
            }
            while (map.size() > k) {
                map.put(x[left],map.get(x[left])-1);
                if (map.get(x[left]) == 0) {
                    map.remove(x[left]);
                }
                left += 1;
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Distinct d = new Distinct();
        char[] arr = "abccdeefegc".toCharArray();
        int k = 2;
        System.out.println(d.dis(arr, k));
    }
}