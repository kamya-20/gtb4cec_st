package week1;

public class Day3 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        // System.out.println(min(arr));
        selectionsort(arr);
        // Arrays.sort(arr)
        for(int i:arr){
            System.out.print(arr[i] + "  "); // problem
        }

    }
    public static int min(int [] arr) {
        int min = Integer.MAX_VALUE;
        int i;
        for(i=0;i<arr.length;i++){
            min = Math.min(min,arr[i]);
        }
        return min;
    }
    // now find index of it 
    // function to reverse jaha se start krna h 
    public static int minimumPartvalue(int[]arr,int a) {
        int min = a;
        for(int i = a+1;i<=arr.length;i++){

            if(arr[min]>arr[i]){
                min = i; 
            }
        }
        return min; // have to see !  // okk so this returns the index of the smallest element and a is jaha se dekhna h .
    }

    // selection sort 
    public static void selectionsort(int []arr) {
        for(int i =0;i<arr.length;i++){ // idhr it can be arr.length-1 as well 
            int idx = minimumPartvalue(arr,i); // ye jaha i h uske aage se min dekhta h and gives i
            int temp = arr[i]; // swapping 
            arr[i]=arr[idx];
            arr[idx]=temp;
        }
    }
    //insertion sort 
    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for(int i =1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j]; // j-- bhi hoskta h idhr --j chlajyega fir 
                --j;
            }
            arr[j+1] = key;
        }

    }
    


}
