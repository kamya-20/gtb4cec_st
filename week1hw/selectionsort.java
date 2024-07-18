package week1hw;

public class selectionsort {
    public static void main(String[] args) {
        int [] arr = {2,4,0,1,8,6};
        selectionSort(arr);
        for(int i:arr){
            System.out.print(i + " "); // plz rem the syntax 
        }
        // printing 
        // for(int i =0;i<arr.length;i++){
        //     System.out.print(arr[i] + "  ");
        // }
    }
    public static void selectionSort(int[]arr) {
        for(int i =0;i<arr.length;i++){
            int idx = minimumValue(arr,i); 
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;

        }
    }
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
