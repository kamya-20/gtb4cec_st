package day2;
import java.util.*;

public class Prac{
    public static void main(String[] args) {
    int n = 5;
    // for(int i = 1 ; i<=n; i++){
    //     for(int j=1 ; j<=i;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
    // left faced 
    // for(int i = 1;i<=n;i++){
    //     for(int k = 1; k<=(n-i);k++){
    //         System.out.print("   ");
            
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
       
    //     System.out.println("");
    // } 

    //inverted right faced 
    // for(int i =n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println("");
    // }
    // }
    
    //pyramid with omission
    // for(int i = 1; i<=n;i++){
    //     for(int k=1;k<=(n-i);k++){
    //         System.out.print("  "); // spaces
    //     }
    //     for(int j1=1;j1<=i;j1++){
    //         System.out.print("* ");
    //     }
    //     for(int j2=2;j2<=i;j2++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    // inverted left faced 
    // for(int i=n;i>=1;i--){
    //     for(int k=1;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int j=1;j<=i;j++){ // for coulmns
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    //q6
    // for(int i=n;i>=1;i--){
    //     for(int k=1;k<=(n-i);k++){
    //         System.out.print("    "); //4space
    //     }
    //     for(int j=1;j<=i;j++){ // for coulmns
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    //q7
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //         if(i==1|| i==n|| j==1|| j==n){
    //             System.out.print("* "); // here space is for ki bettre dikhe
    //         }
    //         else{
    //             System.out.print("  "); // here 2 spaces are ki ek normal space and ek ki upr wali space k saath coordinate 
    //         }
    //     }
    //     System.out.println();
    // }

    // q8
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //         if(i==j || i+j==(n+1)){
    //             System.out.print("* ");
    //         }
    //         else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }

    //q10
    // for(int i=n;i>=1;i--){
    //     for(int k=1;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int j1=1;j1<=i;j1++){
    //         System.out.print("* ");  // column is for inverted left
    //     }
    //     for(int j2=2;j2<=i;j2++){   // j2=2 is omission
    //         System.out.print("* "); // column is for inverted right
    //     }
    //     System.out.println();
    // }

    //q11
    //left faced
    // for(int i=1;i<=n;i++){
    //     for(int k=1;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //         if(j<i){
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }

    //q12
    // for(int i=1;i<=n;i++){
    //     for(int k=1;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //         if(j<i){
    //             System.out.print("! ");
    //         }
    //     }
    //     System.out.println();
    // }


    // // q13
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
    // for(int i=(n-1);i>=1;i--){   // here n-1 is omission
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    //q14
    // for(int i=1;i<=n;i++){
    //     for(int k=1;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }
    // for(int i=(n-1);i>=1;i--){
    //     for(int k=1;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    // q15
    // for(int i = n;i>=1;i--){
    //     for(int k = 1; k<=(n-i);k++){
    //         System.out.print("     ");
            
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
       
    //     System.out.println("");
    // } 

    // for(int i = 2;i<=n;i++){ //omission
    //     for(int k = 1; k<=(n-i);k++){
    //         System.out.print("     ");
            
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
       
    //     System.out.println("");
    // } 

    //q16
    // for (int i = n; i >= 1; i--) {
    //     for (int k = 1; k <= i; k++) {
    //         System.out.print("  ");
    //     }
    //     for (int j = 1; j <= i; j++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();

    // }
    // for (int i = 1; i <=n; i++) {

    //     for (int k = 2; k <= i; k++) { // k ko 2 ni krenge toh overlap nii hoga 
    //         System.out.print("  ");
    //     }
    //     for (int j = 1; j <= i; j++) {

    //         System.out.print("* ");
    //     }

    //     System.out.println();

    // }

     // q17

    // for(int i=(n-4);i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
    //     for(int k=4;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int k=4;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();

    // }
    // System.out.println();
    // for(int i=1;i<=(n-4);i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
    //     for(int k=4;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int k=4;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();

    // }
    
    //18
    //  for(int i=1;i<=n;i++){
    //     if(i%2==0){
    //         continue;
    //     }
    //     for(int k=1;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //         if(j<i){
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }
    //  for(int i=(n-1);i>=1;i--){
    //     if(i%2==0){
    //         continue;
    //     }
    //     for(int k=1;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //         if(j<i){
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }
   
    //q19
    // for(int i=(n-3);i>=2;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
    //     for(int k=1;k<=(n-2*i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int j=1;j<=i && j<(n-3);j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();

    // }
    // for(int i=1;i<=(n-3);i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("* ");
    //     }
    //     for(int k=1;k<=(n-2*i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int j=1;j<=i && j<(n-3);j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();

    // }
     
    
    //q20
    // for(int i=(n-3);i>=2;i--){
    //     for(int j=1;j<=n;j++){
    //         if(i==j || i+j==n+1){
    //             System.out.print("* ");
    //         }
    //         else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }
    // for(int i=1;i<=(n-3);i++){
    //     for(int j=1;j<=n;j++){
    //         if(i==j || i+j==n+1){
    //             System.out.print("* ");
    //         }
    //         else{
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println();
    // }
    

     //q21
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i ;j++){
    //         System.out.print("* ");
    //     }
    //     for(int k=1;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int k=2;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int j=1;j<=i && j<n;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();


    // }
    //q22
    
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i ;j++){
    //         System.out.print("* ");
    //     }
    //     for(int k=1;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int k=2;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int j=1;j<=i && j<n;j++){
    //         System.out.print("* ");
    //     }
    //     System.out.println();


    // }
    
    //q23
    // for(int i=1;i<=n;i++){
    //     for(int k=1;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int j1=1;j1<=i;j1++){
    //         System.out.print("1 ");
    //     }
    //     for(int j2=2;j2<=i;j2++){
    //         System.out.print("1 ");
    //     }
    //     System.out.println();
    // }
    //q24
    // for(int i=1;i<=n;i++){
    //     for(int k=1;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int j1=1;j1<=i;j1++){
    //         System.out.print(i + " ");
    //     }
    //     for(int j2=2;j2<=i;j2++){
    //        System.out.print(i+ " ");
    //     }
    //     System.out.println();
    // }
// q26
    // for(int i=1;i<=n;i++){
    //     for(int k=1;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     for(int j=1;j<=(2*i-1);j++){
    //         System.out.print(j+" ");
    //     }
    //     for(int k=1;k<=(n-i);k++){
    //         System.out.print("  ");
    //     }
    //     System.out.println();

    // }

    //q30
    // for(int i=1;i<=n;i++){
    //     for(int j=n;j>=1;j--){
    //         System.out.print(j + " ");
    //     }
    //     System.out.println();
    // }
    // q31
    // for(int i=1;i<=n;i++){
    //     for(int j=n;j>=1;j--){
            
    //         if(i==j){
    //             System.out.print("* ");
    //         }
    //         else{
    //             System.out.print(j + " ");
    //         }
    //     }
    //     System.out.println();
    // }
    //25
    int count = 1;
    for(int i=1;i<=n;i++){
        for(int k=1;k<=(n-i);k++){
            System.out.print("   ");
        }
        for(int j=1;j<=i;j++){
            if(count<10){
                System.out.print(count + "  ");
            }
            else{
                System.out.print(count + "  ");
            }
            count++;

        }
        for(int j=1;j<=(i-1);j++){
            if(count<10){
                System.out.print(count + " ");
            }
            else{
                System.out.print(count + "  ");
            }
            count++;
            
        }
        System.out.println();
    }

    

   

    

    

    

   

   
    
    

}
}

