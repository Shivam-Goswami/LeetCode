class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str = new StringBuilder();
        for (String x : word1)
            str.append(x);
        StringBuilder s = new StringBuilder();
        for (String x : word2)
            s.append(x);
        if (str.toString().equals(s.toString()))
            return true;
        else
            return false;
    }
}