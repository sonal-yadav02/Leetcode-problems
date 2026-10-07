class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;

        for (char ch : s.toCharArray()) {
            sum += ch;
        }

        for (char ch : t.toCharArray()) {
            sum -= ch;
        }

        return (char) Math.abs(sum);
    }
}