package week1hw;

public class search {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int item = 1;
        System.out.print(search(arr, item));
    }
    public static int  search(int[]arr,int item) {
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
    }
    
}
