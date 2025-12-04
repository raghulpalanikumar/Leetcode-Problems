import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] c, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(c);
        back(c, target, 0, new ArrayList<>(), result);   // ✅ fixed
        return result;
    }

    private void back(int[] c, int t, int s, List<Integer> cur, List<List<Integer>> result) {
        if (t == 0) {
            result.add(new ArrayList<>(cur));   // ✅ make a copy of current list
            return;
        }
        for (int i = s; i < c.length; i++) {
            if (c[i] > t) {
                break;   // ✅ pruning: stop early
            }
            cur.add(c[i]);                        // choose
            back(c, t - c[i], i, cur, result);    // explore
            cur.remove(cur.size() - 1);           // undo choice (backtrack)
        }
    }
}
