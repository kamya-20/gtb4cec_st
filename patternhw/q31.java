package patternhw;

public class q31 {
    public static void main(String[] args) {
    // q31
    int n =5;
    for(int i=1;i<=n;i++){
        for(int j=n;j>=1;j--){
            
            if(i==j){
                System.out.print("* ");
            }
            else{
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }
    }
    
}
