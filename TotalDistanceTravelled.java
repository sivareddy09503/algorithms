//Total distance travelled
//TC:O(n), SC:O(1)
//Input: mainTank = 5, additionalTank = 10
//Output: 60
/*Explanation: 
After spending 5 litre of fuel, fuel remaining is (5 - 5 + 1) = 1 litre and distance traveled is 50km.
After spending another 1 litre of fuel, no fuel gets injected in the main tank and the main tank becomes empty.
Total distance traveled is 60km.*/
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) { 
        int distance = 0;  
        if(mainTank<5)  {
            distance = mainTank *10;
        } else {
            for(int i=1;i<=mainTank;i++) {
              if(additionalTank<0) break;
              if(i%5==0 && additionalTank>0) {
                 mainTank += 1;
                 additionalTank--;
             }
            distance = mainTank *10;
        } 
        }
        return distance;
    }
}