import java.util.*;

class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0, ans = 0;

        for (int right = 0; right < fruits.length; right++) {
            // add current fruit to basket
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            // if more than 2 types, shrink window from left
            while (basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);
                if (basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]);
                }
                left++;
            }

            // update max window size
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
