/**
 * 公平索引
 * 样例 1:
 * 输入:
 * [4,-1,0,3] [-2,5,0,3]
 * 输出:
 * 2
 * <p>
 * 样例 2:
 * 输入:
 * [2,-2,-3,3] [0,0,4,-4]
 * 输出:
 * 1
 * <p>
 * 样例 3
 * 输入:
 * [4,-1,0,3] [-2,6,0,4]
 * 输出:
 * 0
 * <p>
 * 样例 4
 * 输入:
 * [1,4,2,-2,5] [7,-2,-2,2,5]
 * 输出:
 * 2
 */
public class FairIndex {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, -1, 0, 3}, new int[]{-2, 5, 0, 3}));
        System.out.println(solution(new int[]{2, -2, -3, 3}, new int[]{0, 0, 4, -4}));
        System.out.println(solution(new int[]{4, -1, 0, 3}, new int[]{-2, 6, 0, 4}));
        System.out.println(solution(new int[]{1, 4, 2, -2, 5}, new int[]{7, -2, -2, 2, 5}));
    }

    public static int solution(int[] A, int[] B) {
        int length = A.length;
        long sumA = 0;
        long sumB = 0;
        for (int i = 0; i < length; i++) {
            sumA += A[i];
            sumB += B[i];
        }
        if (sumA != sumB) {
            return 0;
        }
        long preA = 0, preB = 0;
        int answer = 0;
        for (int i = 0; i < length - 1; i++) {
            preA += A[i];
            preB += B[i];
            if (preA == preB && sumA - preA == preA) {
                answer += 1;
            }
        }
        return answer;
    }
}
