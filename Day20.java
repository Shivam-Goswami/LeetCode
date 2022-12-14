class Day20 {
    public String intToRoman(int num) {
        int numsVal[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romans = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numsVal.length; i++) {
            while (num >= numsVal[i]) {
                sb.append(romans[i]);
                num -= numsVal[i];
            }
        }
        return sb.toString();
    }
}