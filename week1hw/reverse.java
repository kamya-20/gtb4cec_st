package week1hw;

public class reverse {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        // original array 
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //reversed array print  
        reverseArray(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    public static void change(int [] arr,int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverseArray(int[]arr) {
        int i = 0 , j = arr.length-1;
        while(i<j){
            change(arr,i,j);
            i++;
            j--;
        }
    }
    
}
