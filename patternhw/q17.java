package patternhw;

public class q17 {
    public static void main(String[] args) {
    // q17
     int n =7;   
    for(int i=(n-4);i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        for(int k=4;k<=(n-i);k++){
            System.out.print("  ");
        }
        for(int k=4;k<=(n-i);k++){
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();

    }
    System.out.println();
    for(int i=1;i<=(n-4);i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        for(int k=4;k<=(n-i);k++){
            System.out.print("  ");
        }
        for(int k=4;k<=(n-i);k++){
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();

    }
    }
}
