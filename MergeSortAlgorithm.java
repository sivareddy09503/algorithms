class MergeSortAlgorithm {
    //Merge Sort Algorithm
    //TC:O(nlogn), SC:O(n)
    public void merge(int[] nums, int left, int mid, int right) {
        int n1 = mid-left+1;
        int n2 = right-mid;
        int[] A = new int[n1];//created array A for left partition
        int[] B = new int[n2];//created array B for right partition
        for(int i=0; i<n1; i++){
            A[i] = nums[left+i];
        }
        for(int j=0; j<n2; j++){
            B[j] =nums[mid+1+j];
        }
        //Merge both partitions
        int i=0,j=0,k=left;
        while(i<n1 && j<n2) {
            if(A[i]<B[j]){
                nums[k++] = A[i++];
            } else {
                nums[k++] = B[j++];
            }
        }
        //Add remaining elements in array A
        while(i<n1)nums[k++] = A[i++];
        //Add remaining elements in array B
        while(j<n2)nums[k++] = B[j++];
    }

    public void mergeSort(int[] nums, int left, int right) {
        if(left<right) {
            int mid = left +(right-left)/2;//(left+right)/2
            mergeSort(nums,left,mid);//sorts left partition
            mergeSort(nums,mid+1,right);//sorts right partition
            merge(nums,left,mid,right);//merges both partitions
        }
    }

    public int[] sortArray(int[] nums) {
        int left=0, right=nums.length-1;
        mergeSort(nums,left,right);//Merge Sort Algorithm
        return nums;
    }
}