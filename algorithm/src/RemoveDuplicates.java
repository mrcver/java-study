/**
 * 返回数组中不重复的个数
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 77, 77, 7, 7, 9};
        System.out.println(solution(arr));
        System.out.println(solution(new int[]{1, 1}));
        System.out.println(solution(new int[]{1}));
    }

    /**
     * 双指针算法
     * 返回数组中不重复的个数
     */
    public static int solution(int[] A) {
        if (A.length == 0) {
            return A.length;
        }
        int i = 0;
        for (int j = 1; j < A.length; j++) {
            if (A[i] != A[j]) {
                i++;
                A[i] = A[j];
            }
        }
        // i是下标所以返回+1个数
        return i + 1;
    }
}
