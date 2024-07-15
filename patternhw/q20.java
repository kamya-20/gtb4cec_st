package patternhw;

public class q20 {
    public static void main(String[] args) {
    //q20
    int n =7;
    for(int i=(n-3);i>=2;i--){
        for(int j=1;j<=n;j++){
            if(i==j || i+j==n+1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    for(int i=1;i<=(n-3);i++){
        for(int j=1;j<=n;j++){
            if(i==j || i+j==n+1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    }
}
