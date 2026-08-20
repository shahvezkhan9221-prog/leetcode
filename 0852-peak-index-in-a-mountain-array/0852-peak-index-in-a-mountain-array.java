class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            
            // If the element is smaller than the next one, we are ascending.
            // Therefore, the peak must be to the right of mid.
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } 
            // Otherwise, we are descending (or at the peak).
            // Therefore, the peak is at mid or to the left of mid.
            else {
                end = mid;
            }
        }
        
        // start and end converge to the peak index
        return start; 
    }
}