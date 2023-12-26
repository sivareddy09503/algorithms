//Number of days between two dates
//TC:O(1), SC:O(1)
//Input: date1 = "2019-06-29", date2 = "2019-06-30"
//Output: 1
class Solution {
    int[] daysPerMonth = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(daysFrom1971(date1)-daysFrom1971(date2));
    }
    public int daysFrom1971(String date) {
        String[] dateArray = date.split("-");
        int year = Integer.parseInt(dateArray[0]);
        int month = Integer.parseInt(dateArray[1]);
        int day = Integer.parseInt(dateArray[2]);
        int yearsFrom1971 = year-1971;
        boolean isLeap = (year%4==0) &&(year%100!=0 || year%400==0);
        if(month>2&&isLeap) day++;
        for(int m=1;m<month;m++) {
            day += daysPerMonth[m-1];
        }
        return day + yearsFrom1971 * 365 + countLeapYears(year);
    }
    public int countLeapYears(int year) {
        int count = 0;
        for(int i=1971;i<year;i++) {
            if((i%4==0)&&(i%100!=0 || i%400==0)) {
                count++;
            }
        }
        return count;
    }
}