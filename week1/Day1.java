package week1;
import java.util.*;

public class Day1 {
    public static void main(String[] args) {
        // int [] arr = new int [4]; 
        // arr[1] = 10; 
        // displayArray(arr);
        
        System.out.println(reverse(9234));
        armstrong(7);
    }
    // functions
    public static void displayArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "  ");
        }
        // bhook lgri
    }
    // function to check whether it is prime or not 
    public static boolean primeNumber(int n){
        int count = 1;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count ==2){
           return true;
        }
        else{
            return false;
        }
    }
    // function to return reverse no
    public static int reverse(int n){
        int revs =0;
        while(n>0){
        int ld = n%10;
        revs = (revs *10) + ld;
        n= n/10;
        }
        
        return revs;
        
    } 
    // function to count no of digits 
    public static int count(int n){
        int temp = n;
       
        int c = 0;
        while(temp>0){
            int ld = temp%10;
            c++;
            temp = temp/10;
        }
        return c;

    }
    public static void armstrong(int n){
        int temp = n;
        
        int arm =0;
        while(temp>0){
            int pow = count(n);
            int ld = temp%10;
            arm +=Math.pow(ld,pow);
            temp = temp/10;
        }
        if(arm == n){
            System.out.print("Armstrong ");
        }
        else{
            System.out.print("Armstrong");
        }

    }

}
