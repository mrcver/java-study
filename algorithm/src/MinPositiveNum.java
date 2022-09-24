/**
 * 最小正整数
 */
public class MinPositiveNum {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{-1, 2, 3, 4}));
        System.out.println(solution(new int[]{1, 2, 3, 4}));
        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));
    }

    public static int solution(int[] arr) {
        int l = 0;
        int r = arr.length;
        int temp;
        while (l < r) {
            //在理想的位置
            if (arr[l] == l + 1) {
                l++;
            }
            //不合法的数据
            else if (arr[l] > r || arr[l] <= l || arr[arr[l] - 1] == arr[l]) {
                arr[l] = arr[--r];
            }
            //合法但是没有在理想的位置上
            else {
                temp = arr[l];
                arr[l] = arr[arr[l] - 1];
                arr[temp - 1] = temp;
            }
        }

        return l + 1;
    }
}
