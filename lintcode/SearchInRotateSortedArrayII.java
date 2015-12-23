/*
 * Follow up for "Search in Rotated Sorted Array":
What if duplicates are allowed?

Would this affect the run-time complexity? How and why?

Write a function to determine if a given target is in the array.
 */
public class SearchInRotatedSortedArrayII {

    /** 
     * param A : an integer ratated sorted array and duplicates are allowed
     * param target :  an integer to be search
     * return : a boolean 
     */
    public boolean search(int[] A, int target) {
        int low = 0;
        int high = A.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A[mid] == target) {
                return true;
            } else if (A[low] == A[high]) {
                high--;
            } else {
                if (A[mid] > A[high] && (target > A[mid] || target < A[mid] && target < A[low]) || A[mid] < target && target < A[high]) {
                    low = mid + 1;
                }
                if (A[high] < A[mid] && A[mid] < target || target < A[mid] && A[high] < A[mid] || A[mid] < target && target < A[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }


                if (A[mid] > A[high]) {
                    if (target > A[mid]) {
                        low = mid + 1;
                    } else if (target < A[mid]) {
                        if (target < A[low]) {
                            low = mid + 1;
                        } else if (target > A[low]) {
                            high = mid - 1;
                        }
                    }
                } else if (A[mid] < A[high]) {
                    if (target < A[mid]) {
                        high = mid - 1;
                    } else if (target > A[mid]) {
                        if (target > A[high]) {
                            high = mid - 1;
                        } else if (target < A[high]) {
                            low = mid + 1;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean search(int[] A, int target) {
        int low = 0;
        int high = A.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A[mid] == target) {
                return true;
            } else if (A[low] == A[high]) {
                high--;
            } else {
                if (A[mid] > A[high]) {
                    if (A[low] < target && target < A[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                } else {
                    if (A[mid] < target && target < A[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
            }
        }
        return false;
    }

}
