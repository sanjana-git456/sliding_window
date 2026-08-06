
import java.util.*;

public class NonRep {

    public int non(char[] x) {
        int left = 0;
        int ans = 0;
        HashSet<Character> map = new HashSet<>();
        for (int right = 0; right < x.length; right++) {
            while (map.contains(x[right])) {
                map.remove(x[left]);
                left++;
            }
            map.add(x[right]);
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
