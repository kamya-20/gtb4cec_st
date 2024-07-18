package week1;

public class Day2 {
    public static void main(String[] args) {
        int arr[]= {4,2,6,7,10};
        
        // System.out.print(add(arr));
        // int item = 7;
        // System.out.print(find(arr, 7));
        // int a=7;
        // int b=8;
        // swap(7,8);
        // System.out.print(a+" "+b);
        reverse(arr);


        
    }
    // function to find the sum of the complete array
    public static int add(int[]arr){
        int s = 0;
        for(int i=0;i<arr.length;i++){
            s+= arr[i];
        }
        return s;
    }
    // function to search an element in our array
    public static int find(int [] arr,int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }
            
        }
        return -1;
    }
    // function to swap 2 numbers 
    public static void swap(int a , int b) {
        int c ;
        c=a;
        a=b;
        b=c;
        // System.out.print("After swapping numbers are ",a,b);
        
    } 
    // function to reverse an array 
    public static void reverse(int [] arr) {
        int [] rev = new int[5];
        int n = arr.length;
        for(int i =0;i<rev.length;i++){
            for(int j=n-1;j>=0;j--){
                rev[i]=arr[j];
            }
        
        }
        // printing new array
        for(int k=0;k<rev.length;k++){
                System.out.print(rev[k] + " ");
            }
        
        }
        // 1 4 8 7  2 5 5 8 10 3
        public static void dryRunThis(int[] arr) {
            for(int turn =1;turn<arr.length;turn++){
                for(int i=0;i<arr.length-turn;i++){
                    if(arr[i]>arr[i+1]){
                        int temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1]=temp;
                    }
                }
            }
            
        }
}
