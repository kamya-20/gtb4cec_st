package week1hw;

public class insertionsort {
    public static void main(String[] args) {
        int[]arr = {6,5,4,3,2,1};
        insertion(arr);
        //printing the array
        for(int i : arr){
            System.out.print(i+"  ");
        }
    }
    public static void insertion(int[]arr) {
        for(int i =0;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1]=key;
        }
    }
}
