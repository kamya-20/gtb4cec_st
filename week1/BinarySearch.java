package week1;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr  = {1,2,3,4,5}; // Array has to be sorted 
        // if array is not sorted : Arrays.sort(arr)
        // System.out.println(lowerBound(arr, 2));
        System.out.println(binarysrc(arr, 1));
        
    }
    public static boolean  binarysrc(int arr[],int key) {
        int start = 0 , end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return true; // return  mid agr index 
            }
            if(arr[mid]>key){
                    end = mid -1;
            }
            else{
                start = mid + 1;
            }
        }
        return false; // -1 
        
    }

    // lower bound 
    public static int lowerBound(int []arr ,int key) {
        int start = 0, end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                ans = mid;
                end = mid-1;
            }
            else if (arr[mid]>key){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }

        }
        return ans;
    }
    // upper bound
    public static int upperBound(int []arr ,int key) {
        int start = 0, end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                ans = mid+1; // jaha occurence aari h uski next wali chahiye
                start= mid+1;
            }
            else if (arr[mid]>key){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }

        }
        return ans;
    }
}
