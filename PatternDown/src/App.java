public class App {
    public static void main(String[] args) throws Exception {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}