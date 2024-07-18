package week1hw;

public class minimum {
    public static void main(String[] args) {
        int [] arr = {1,2,33,41,5};
        System.out.println(minimum(arr));
        System.out.println(minimumValue(arr, 2));
    }
    public static int minimum(int []arr) {
        int min = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            min = Math.min(min,arr[i]);

        }
        return min; // it returns the minimum value
    }
    // function to give index of minimum elem from where dekhna h
    public static int minimumValue(int[]arr,int a) {
        int min = a;
        for(int i = a+1;i<arr.length;i++){
            if(arr[min]>arr[i]){
                min=i;
            }
        }
        return min;
    }
}
