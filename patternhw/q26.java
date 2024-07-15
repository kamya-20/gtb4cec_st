package patternhw;

public class q26 {
    public static void main(String[] args) {
    // q26
    int n= 5;
    for(int i=1;i<=n;i++){
        for(int k=1;k<=(n-i);k++){
            System.out.print("  ");
        }
        for(int j=1;j<=(2*i-1);j++){
            System.out.print(j+" ");
        }
        for(int k=1;k<=(n-i);k++){
            System.out.print("  ");
        }
        System.out.println();

    }
    }
    
}
