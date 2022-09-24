import java.util.Arrays;

/**
 * 计算质数个数
 */
public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(solution(100));
    }

    public static int solution(int n) {
        int[] isPrime = new int[n];
        Arrays.fill(isPrime, 1);
        int ans = 0;
        for (int i = 2; i < n; ++i) {
            if (isPrime[i] == 1) {
                // 2是质数，所以第一次进来的时候ans+1
                ans += 1;
                if ((long) i * i < n) {
                    // 接上面，利用后面的for循环遍历出所有2的倍数是否质数，依次递归下去
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = 0;
                    }
                }
            }
        }
        return ans;
    }
}
