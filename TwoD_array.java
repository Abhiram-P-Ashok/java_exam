import java.util.Scanner;

public class TwoD_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum=0,n;
        System.out.print("Enter the size of the 2-D Array : ");
        n = sc.nextInt();
        int[][] num = new int [n][n];
        System.out.println("Enter the array ellements : ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                num[i][j]=sc.nextInt();
            }
        }

        System.out.println("\nArray elements :");
        for(int i=0; i<num.length; i++){
            for(int j=0; j<n; j++){
                System.out.print("\t"+num[i][j]);
                sum = sum+num[i][j];
            }
            System.out.println(" ");
        }
        System.out.println(sum);
        sc.close();
    }
}
