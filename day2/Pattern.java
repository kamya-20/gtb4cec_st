package day2;
import java.util.*;

public class Pattern {
     public static void main(String[] args) {
        int n ;
        Scanner input  = new Scanner(System.in);
        n = input.nextInt(); 
        // for(int i = 0 ; i < n ; i++){
        //     System.out.print("* ");
        // }
        // for(int i = 1 ; i<= n ; i++){
        //     for(int j = 1 ; j<= n ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println("");
        // }
        // for(int i = 1 ; i<=n; i++){
        //     for(int j = 1 ; j<=i; j++){
        //         System.out.println("* ");
        //     }
        //     System.out.println("");
        // }

        //left facing 

        // for(int i = 1 ; i<=n; i++){
        //     for(int k = 1 ; k <= (n-i);k++){
        //         System.out.print("  "); // 2 space 
               
        //     }
        //     for(int j = 1 ; j<=i; j++){
        //         System.out.print("* ");
        //     }
            
        //     System.out.println("");
        // }

    //      *
    //     * *
    //   * * *
    // * * * *

    // inverted right facing 
    
    // for(int i = n; i>=1; i--){
    //     for(int j = 1; j<=i; j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println("");
    // }

    // * * * *
    // * * *
    // * *
    // *

    // inverted left facing 
    // for(int i = n ; i>=1; i--){
    //         for(int k = 1 ; k <= (n-i);k++){
    //             System.out.print("  "); // 2 space 
               
    //         }
    //         for(int j = 1 ; j<=i; j++){
    //             System.out.print("* ");
    //         }
            
    //         System.out.println("");
    //     }

    // ques 
    // for(int i = n ; i>=1; i--){
    //         for(int k = 1 ; k <= (n-i);k++){
    //             System.out.print("    "); // 2 space 
               
    //         }
    //         for(int j = 1 ; j<=i; j++){
    //             System.out.print("* ");
    //         }
            
    //         System.out.println("");
    //     }

    // for(int i = 1 ; i<= n ; i++){
    //     for(int j = 1 ; j<= n ; j++){
    //         if(i==1 || i==n || j==1 || j==n){
    //             System.out.print("* ");
    //         }
    //         else{
    //             System.out.print("  "); // 2 space 
    //         }
                
    //         }
    //         System.out.println("");
    //     }

    // ques diagonal 
    // for(int i = 1 ; i<= n ; i++){
    //     for(int j = 1 ; j<= n ; j++){
    //         if(i==j || i+j==n+1){
    //             System.out.print("* ");
    //         }
    //         else{
    //             System.out.print("  "); // 2 space 
    //         }
                
    //         }
    //         System.out.println("");
    //     }

    // for(int i = 1; i<=n ; i++){
    //     for(int k =1;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int j1 = 1 ; j1<=n ; j1++){
    //         System.out.print("* ");
           
    //     }
    //     for(int j2 = 1 ; j2<=n-1 ; j2++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();9
        
    //     }




    // for(int i = 1 ; i<=n; i++){
    //         for(int k = 1 ; k <= (n-i);k++){
    //             System.out.print("  "); // 2 space 
               
    //         }
    //         for(int j = 1 ; j<=i; j++){
    //             System.out.print("* ");
    //         }
            
    //         System.out.println("");
    // }
    // for(int i = n-1 ; i>=1; i--){
    //         for(int k = 1 ; k <= (n-i);k++){
    //             System.out.print("  "); // 2 space 
               
    //         }
    //         for(int j = 1 ; j<=i; j++){
    //             System.out.print("* ");
    //         }
            
    //         System.out.println("");
    //     }

    // q15
    // for(int i = n ; i>=1; i--){
    //         for(int k = 1 ; k <= (n-i);k++){
    //             System.out.print("    "); // 2 space 
               
    //         }
    //         for(int j = 1 ; j<=i; j++){
    //             System.out.print("* ");
    //         }
            
    //         System.out.println("");
    //     }
    // for(int i = 2 ; i<=n; i++){
    //         for(int k = 1 ; k <= (n-i);k++){
    //             System.out.print("    "); // 2 space 
               
    //         }
    //         for(int j = 1 ; j<=i; j++){
    //             System.out.print("* ");
    //         }
            
    //         System.out.println("");
    // }
    // pyramid 
    for(int i = 1; i<=n ; i++){
        for(int k =1;k<=(n-i);k++){
            System.out.print("  ");
        }
        for(int j1 = 1 ; j1<i ; j1++){
            System.out.print("* ");
           
        }
        for(int j2 = 2 ; j2<i ; j2++){
            System.out.print("* ");
        }
        System.out.println();
        
    }


           
        
            
}
       
    }




        
     // for(int k1 =1;k1<=(n-i);k1++){
        //         for(int j2 = 1 ; j2<=n ; j2++){
        //             System.out.print("* ");
                   
        //  

 