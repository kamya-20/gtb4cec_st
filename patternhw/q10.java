package patternhw;

public class q10 {
    public static void main(String[] args) {
    //q10
    int n=5;
    for(int i=n;i>=1;i--){
        for(int k=1;k<=(n-i);k++){
            System.out.print("  ");
        }
        for(int j1=1;j1<=i;j1++){
            System.out.print("* ");  // column is for inverted left
        }
        for(int j2=2;j2<=i;j2++){   // j2=2 is omission
            System.out.print("* "); // column is for inverted right
        }
        System.out.println();
    }
    }
}
