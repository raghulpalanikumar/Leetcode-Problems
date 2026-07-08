import java.util.*;

class Solution {

    static final int MOD = 1000000007;

    public int[] sumAndMultiply(String s, int[][] queries) {

        int n = s.length();

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> digit = new ArrayList<>();

        // Store non-zero digits and their positions
        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';
            if (d != 0) {
                pos.add(i);
                digit.add(d);
            }
        }

        int m = digit.size();

        long[] prefixSum = new long[m + 1];
        long[] prefixValue = new long[m + 1];
        long[] power10 = new long[m + 1];

        power10[0] = 1;

        for (int i = 1; i <= m; i++) {
            power10[i] = (power10[i - 1] * 10) % MOD;
        }

        for (int i = 1; i <= m; i++) {
            prefixSum[i] = prefixSum[i - 1] + digit.get(i - 1);
            prefixValue[i] = (prefixValue[i - 1] * 10 + digit.get(i - 1)) % MOD;
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            int left = lowerBound(pos, l);
            int right = upperBound(pos, r) - 1;

            if (left > right) {
                ans[i] = 0;
                continue;
            }

            int len = right - left + 1;

            long value =
                    (prefixValue[right + 1]
                    - (prefixValue[left] * power10[len]) % MOD
                    + MOD) % MOD;

            long sum = prefixSum[right + 1] - prefixSum[left];

            ans[i] = (int) ((value * (sum % MOD)) % MOD);
        }

        return ans;
    }

    int lowerBound(ArrayList<Integer> list, int target) {

        int l = 0;
        int r = list.size();

        while (l < r) {

            int mid = (l + r) / 2;

            if (list.get(mid) < target)
                l = mid + 1;
            else
                r = mid;
        }

        return l;
    }

    int upperBound(ArrayList<Integer> list, int target) {

        int l = 0;
        int r = list.size();

        while (l < r) {

            int mid = (l + r) / 2;

            if (list.get(mid) <= target)
                l = mid + 1;
            else
                r = mid;
        }

        return l;
    }
}