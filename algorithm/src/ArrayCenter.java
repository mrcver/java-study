import java.util.Arrays;

/**
 * 数组的中心下标，满足左右两边的和相等，如果有多个要返回最左边的下标
 */
public class ArrayCenter {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(solution(new int[]{1, 2, 3, 3}));
        System.out.println(solution(new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{1}));

        System.out.println(solution2(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(solution2(new int[]{1, 2, 3, 3}));
        System.out.println(solution2(new int[]{1, 2, 3}));
        System.out.println(solution2(new int[]{1}));
    }

    public static int solution(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int sum = Arrays.stream(arr).sum();
        int subSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (subSum * 2 + arr[i] == sum) {
                return i;
            }
            subSum += arr[i];
        }
        return -1;
    }

    public static int solution2(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int sum = Arrays.stream(arr).sum();
        int subSum = 0;
        for (int i = 0; i < arr.length; i++) {
            subSum += arr[i];
            if (subSum == sum) {
                return i;
            }
            sum -= arr[i];
        }
        return -1;
    }
}
