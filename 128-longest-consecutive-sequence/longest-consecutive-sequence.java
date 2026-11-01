import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;

        // Iterate over HashSet instead of nums
        for (int num : numSet) {

            // Check if it is the starting number
            if (num != Integer.MIN_VALUE && !numSet.contains(num - 1)) {

                int length = 0;
                long current = num;

                while (current <= Integer.MAX_VALUE &&
                       numSet.contains((int) current)) {

                    length++;
                    current++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}