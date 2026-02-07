public class Twosumproblem {
    static void main() {
        int[] nums = {2, 3, 4, 5, 6, 7};
        int target = 10;
        int[] ans = new int[2];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}

