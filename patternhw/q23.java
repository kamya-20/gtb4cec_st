package patternhw;

public class q23 {
    public static void main(String[] args) {
    //q23
    int n =5;
    for(int i=1;i<=n;i++){
        for(int k=1;k<=(n-i);k++){
            System.out.print("  ");
        }
        for(int j1=1;j1<=i;j1++){
            System.out.print("1 ");
        }
        for(int j2=2;j2<=i;j2++){
            System.out.print("1 ");
        }
        System.out.println();
    }
    }
    
}
