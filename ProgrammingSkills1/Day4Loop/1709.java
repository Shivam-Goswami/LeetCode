class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int charMap[] = new int[26];
        int diffCount = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                diffCount++;
            charMap[s1.charAt(i) - 'a']++;
            charMap[s2.charAt(i) - 'a']--;
        }
        for (int x : charMap)
            if (x > 0)
                return false;
        return (diffCount == 0 || diffCount == 2);
    }
}