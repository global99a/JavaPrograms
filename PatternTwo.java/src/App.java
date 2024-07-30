import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n*2;j++)
            {
                if(i==j)
                {
                    System.out.println(i + " ");
                }
                else
                {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
        
        
        

}
}
