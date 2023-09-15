class SequentialDigits{
    //Sequential Digits
    //Input: low = 100, high = 300
    //Output: [123,234]
    //TC:O(1), SC:O(1)
    public List<Integer> sequentialDigits(int low, int high) {
        String digits = "123456789";
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=9; i++) {
            for(int j=0;i+j<=9;j++) {
                String tmp = digits.substring(j,i+j);
                int val = Integer.valueOf(tmp);
                if(val>=low && val<=high) {
                    list.add(val);
                }
            }
        }
        return list;
    }
}