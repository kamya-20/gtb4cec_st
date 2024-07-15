package patternhw;

public class q13 {
    public static void main(String[] args) {
     // q13
     int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    for(int i=(n-1);i>=1;i--){   // here n-1 is omission
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
    
}
