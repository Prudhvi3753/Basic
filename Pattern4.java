public class Pattern4 {
    public static void main(String[] args){
        int a=5;
        int b=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(b+" ");
                b++;
            }
            System.out.println("");
        }
    }
}
