import java.util.Arrays;
class Solution {
    public  double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double farenheit = ((celsius * 1.80) + 32.00);
        double [] ans =  {kelvin, farenheit};
        return ans; 
    }

    public void main(String[] args) {
        double [] case1 = convertTemperature(32);
        System.out.println(Arrays.toString(case1));
    }
}