import java.util.Arrays;

public class Nb23_IsPartitionPossible {
    public static boolean isKPartitionPossible(int[] nums, int N, int k) {
        Arrays.sort(nums);
        int sum = Arrays.stream(nums).sum();
        int target = sum / k;
        if (sum % k > 0 || nums[N - 1] > target) return false;

        boolean[] dp = new boolean[1 << N]; //BIT SHIFTING
        dp[0] = true;
        int[] total = new int[1 << N];

        for (int state = 0; state < (1 << N); state++) {
            if (!dp[state]) continue;
            for (int i = 0; i < N; i++) {
                int future = state | (1 << i);
                if (state != future && !dp[future]) {
                    if (nums[i] <= target - (total[state] % target)) {
                        dp[future] = true;
                        total[future] = total[state] + nums[i];
                    } else {
                        break;
                    }
                }
            }
        }
        return dp[(1 << N) - 1];
    }

    public static void main(String[] args) {
        int[] nums = {2,1,4,5,6};
        int k = 3;
        System.out.println(isKPartitionPossible(nums,nums.length,k));
    }
}
