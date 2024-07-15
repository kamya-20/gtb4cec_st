package patternhw;

public class q6 {
    public static void main(String[] args) {
    //q6
    int n = 5;
    for(int i=n;i>=1;i--){
        for(int k=1;k<=(n-i);k++){
            System.out.print("    "); //4space
        }
        for(int j=1;j<=i;j++){ // for coulmns
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}
