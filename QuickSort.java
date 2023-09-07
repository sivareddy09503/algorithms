class QuickSort {
    //QuickSort Algorithm
    //TC:O(nlogn), SC:O(n)
    public void quickSort(int[] nums, int low, int high) {
        if(low<high) {
            //pivot element index after partition
            int pi = partition(nums,low,high);
            //left partition
            quickSort(nums,low,pi-1);
            //right partion
            quickSort(nums,pi+1,high);
        }
    }

    public int partition(int[] nums, int low, int high) {
        int i = low-1;//always this element less than pivot
        //select random element as pivot
        random(nums,low,high);
        int pivot = nums[high];
        for(int j=low;j<high;j++) {
            //swaps all elements to left which is less than pivot
            if(nums[j]<pivot) {
                i++;
                swap(nums,i,j);
            }
        }
        //swaps pivot element to correct position
        swap(nums,i+1,high);
        return i+1;
    }

    public void random(int[] nums,int low,int high)
    {
     
        Random rand= new Random();
        int pivot = rand.nextInt(high-low)+low;
         
        int temp1=nums[pivot]; 
        nums[pivot]=nums[high];
        nums[high]=temp1;
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public int[] sortArray(int[] nums) {
        int low = 0, high = nums.length-1;
        quickSort(nums,low,high);
        return nums;
    }
}