package week1;

public class maximum {
    public static void main(String[] args) {
        int arr[]= {4,2,6,7,10};
        System.out.print("The maximum value is ");
        System.out.print(maximum(arr));

    }
    public static int maximum(int[] arr) {
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
           
        }
        return max;
    }
    
}

// ANOTHER APPROACH 
// public static int maximum(int[] arr) {
//     int max = 0;
//     for(int i:arr){// for each loop
//         max = Math.max(i,max);
//     }  
//     return max;
// }


// one more method

// import util.Arrays;
//Integer [] arr = {1,2,3,4,5}
 
// int max = Collections.max(Arrays.asList(arr));



