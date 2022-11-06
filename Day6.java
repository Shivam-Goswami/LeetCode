class Solution {
    public String orderlyQueue(String s, int k) {
        char[] temp = s.toCharArray();
        if (k > 1){
            Arrays.sort(temp);
            return new String(temp);
        }
        String ans = s;
        for (int i = 1; i < s.length(); i++) 
        {
            String rot = s.substring(i) + s.substring(0, i);
            if (ans.compareTo(rot) > 0) ans = rot;
        }
        return ans;
    }
}
