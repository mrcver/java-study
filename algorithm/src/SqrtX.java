/**
 * 求平方根的最小整数部分
 */
public class SqrtX {
    public static void main(String[] args) {
        System.out.println(solution(9));
        System.out.println(solution(24));
    }

    /**
     * 二分查找 （logN）
     *
     * @param x
     * @return
     */
    public static int solution(int x) {
        int index = -1, l = 0, r = x;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid * mid <= x) {
                index = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return index;
    }
}
