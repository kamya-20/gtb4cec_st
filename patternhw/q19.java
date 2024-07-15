package patternhw;

public class q19 {
    public static void main(String[] args) {
        int n=7;
    //q19
    for(int i=(n-3);i>=2;i--){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        for(int k=1;k<=(n-2*i);k++){
            System.out.print("  ");
        }
        for(int j=1;j<=i && j<(n-3);j++){
            System.out.print("* ");
        }
        System.out.println();

    }
    for(int i=1;i<=(n-3);i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        for(int k=1;k<=(n-2*i);k++){
            System.out.print("  ");
        }
        for(int j=1;j<=i && j<(n-3);j++){
            System.out.print("* ");
        }
        System.out.println();

    }
    }
}
