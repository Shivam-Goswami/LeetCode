class Solution {
    public double average(int[] salary) {
        double sum = 0.0;
        int max = salary[0], min = salary[0];
        for (int x : salary) {
            sum += x;
            max = Math.max(max, x);
            min = Math.min(min, x);
        }
        sum = sum - max - min;
        return sum / (salary.length - 2);
    }
}