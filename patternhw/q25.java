package patternhw;

public class q25 {
    public static void main(String[] args) {
    //25
    int n = 5;
    int count = 1;
    for(int i=1;i<=n;i++){
        for(int k=1;k<=(n-i);k++){
            System.out.print("   ");
        }
        for(int j=1;j<=i;j++){
            if(count<10){
                System.out.print(count + "  ");
            }
            else{
                System.out.print(count + "  ");
            }
            count++;

        }
        for(int j=1;j<=(i-1);j++){
            if(count<10){
                System.out.print(count + " ");
            }
            else{
                System.out.print(count + "  ");
            }
            count++;
            
        }
        System.out.println();
    }
    }
    
}
