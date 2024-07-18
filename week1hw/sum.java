package week1hw;

public class sum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(added(arr));
    }
    public static int added(int [] arr) {
        int s = 0;
        for(int i =0;i<arr.length;i++){
            s+=arr[i];
        }
        return s;
    }
    
}
