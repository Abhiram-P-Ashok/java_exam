import java.util.*;

public class OneD_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of the 1-D Array : ");
        n = sc.nextInt();
        int[] num = new int [n];
        System.out.println("Enter the array ellements : ");
        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
        }

        System.out.println("Array elements :");
        for(int i=0; i<num.length; i++){
            System.out.print("\t"+num[i]);
        }
        Arrays.sort(num);

        System.out.println("\nSorted Array :");
        for(int i=0; i<num.length; i++){
            System.out.print("\t"+num[i]);
        }
        sc.close();
    }
}
