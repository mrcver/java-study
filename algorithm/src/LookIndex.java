import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 找出数组中两数之和=xx的两数下标
 */
public class LookIndex {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6, 7}, 9)));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6, 7}, 14)));
    }

    public static int[] solution(int[] nums, int sum) {
        Map<Integer, Integer> mapInt = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mapInt.containsKey(sum - nums[i])) {
                return new int[]{i, sum - i};
            }
            mapInt.put(i, i);
        }
        return new int[0];
    }
}
