package G4G;

class Array_is_sorted_or_Not {
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        if(n == 1) {
            return true;
        }
        for(int i = 1; i < n; i++) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }
}