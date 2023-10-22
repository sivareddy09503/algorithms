//Convert the temperature problem
//TC:O(1), SC:O(1)
//Input: celsius = 36.50
//Output: [309.65000,97.70000]
class Solution {
    public double[] convertTemperature(double celsius) {
        double[] result = new double[2];
        result[0] = celsius + 273.15;
        result[1] = celsius * 1.80 + 32.00;
        return result;
    }
}