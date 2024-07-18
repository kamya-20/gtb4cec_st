package week1hw;

public class binarysrch {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        System.out.println(binarySearch(arr, 5));

    }
    public static boolean binarySearch(int[]arr,int target) {
        int st = 0, end = arr.length-1;
        while(st<=end){
            int mid =(st+end)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid]>target){
                end = mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return false;
    }
}
