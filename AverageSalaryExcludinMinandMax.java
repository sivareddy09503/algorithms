//Avarage salary excluding the minimum and maximum salary
//TC:O(n), SC:O(1)
/*Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500*/
class Solution {
    public double average(int[] salary) {
        int min = salary[0], max = salary[0], result = salary[0];
        for(int i=1;i<salary.length;i++) {
            if(salary[i]<min) min = salary[i];
            if(salary[i]>max) max = salary[i];
            result +=salary[i];
        }
        return (double)(result-min-max)/(salary.length-2);
    }
}