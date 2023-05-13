package LeetCode_Quetions;

class Q2389 {
    public int[] answerQueries(int[] nums, int[] queries) {
        //My approach
        /*
        int[] ans = new int[queries.length];
        Arrays.sort(nums);
        for(int i=0;i<queries.length;i++){
            int sum=0;
            int c=0;
            for(int j=0;j<nums.length;j++){
                sum+=nums[j];
                if(sum>queries[i]){
                    break;
                }
                c++;
            }
            ans[i]=c;
        }
        return ans;
        */

        //Using binary search
        int n = nums.length;
        int m = queries.length;
        
        // Sorting array nums
        Arrays.sort(nums);
        
        // Taking prefix sum
        for(int i = 1; i < n; i++) {
            nums[i] += nums[i - 1];
        }
        
        int[] ans = new int[m];
        for(int i = 0; i < m; i++) {
            int q = queries[i];
            
            // performing binary search for each query
            int low = 0, high = n - 1;
            while(low <= high) {
                int mid = low + (high - low) / 2;
                if(nums[mid] == q) {
                    ans[i] = mid + 1;
                    break;
                }
                else if(nums[mid] < q) {
                    ans[i] = mid + 1;
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        
        return ans;
    }
}