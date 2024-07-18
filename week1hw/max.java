package week1hw;

public class max {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.print("The max is ");
        System.out.print(maxm(arr));
    }
    public static int maxm(int [] arr) {
        int max = 0;
        for(int i =0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
        
    }
}
