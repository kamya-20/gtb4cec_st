package day1;

public class operators {
    public static void main(String[] args) {
        // int a = 1;
        // int b = 2;
        // int sum= a+b;
        // System.out.println(sum);
        // int sum = 0;
        // for(int i = 1 ; i< 25 ; i++){
        //     sum += i;
        //     System.out.print(sum + " ");
        // }

        // output the first multiple of 2 and 7
        int i = 1 ; 
        while(i<15){
            if( i%2==0 && i%7==0){
                System.out.println(i);
                break;
            }
            else{
                i++;
            }
        }
    }
}
