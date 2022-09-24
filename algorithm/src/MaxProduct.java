/**
 * 三数最大乘积， 通过线性扫描
 */
public class MaxProduct {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, -3, 6, 7}));
        System.out.println(solution(new int[]{1, 2, -3, -6, 7}));
    }

    public static int solution(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int x : nums) {
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2) {
                min2 = x;
            }

            if (x > max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            } else if (x > max2) {
                max3 = max2;
                max2 = x;
            } else if (x > max3) {
                max3 = x;
            }
        }
        System.out.println(String.format("%s, %s, %s, %s, %s, %s", min1, min2, max1, max1, max2, max3));
        // 绝对值大或者三个最大的数乘积
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}
