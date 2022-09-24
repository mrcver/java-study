/**
 * 斐波那契数列
 */
public class Fib {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    /**
     * 双指针 空间复杂度O(1) 时间复杂度O(N)
     *
     * @param index 索引下标
     * @return 第index位的数
     */
    public static int solution(int index) {
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }
        int low = 0, high = 1;
        int temp;
        for (int i = 2; i <= index; i++) {
            temp = low;
            low = high;
            high = temp + high;
        }
        return high;
    }

    //todo 递归
}
