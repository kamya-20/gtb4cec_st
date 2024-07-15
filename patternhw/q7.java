package patternhw;

public class q7 {
    public static void main(String[] args) {
    //q7
    int n =5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==1|| i==n|| j==1|| j==n){
                System.out.print("* "); // here space is for ki bettre dikhe
            }
            else{
                System.out.print("  "); // here 2 spaces are ki ek normal space and ek ki upr wali space k saath coordinate 
            }
        }
        System.out.println();
    }
    }
    
}
