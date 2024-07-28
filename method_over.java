import java.util.Scanner;
public class method_over{
    public static float area(float half, float b, float h){
        return (float)(half*b*h);
    }
    public static double area(float r, double pi){
        return (double)(pi*r*r);
    }
    public static float area(float b, float l){
        return (float)(b*l);
    }
    public static float area(float n){
        return (float)(n*n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int limit = 5, opt=1;
        float h,l,b;
        while(opt<limit && opt>limit){
            System.out.println("Menu:\n1. Area of Triangle\n2. Area of Circle\n3. Area of Rectangle\n 4. Area of square\n5. EXIT\nEnter the option : ");
            opt = sc.nextInt();
            switch (opt) {
            case 1:
                System.out.println("\nEnter the base length of the triangle : ");
                b = sc.nextFloat();
                System.out.println("\nEnter the height of the triangle : ");
                h = sc.nextFloat();
                System.out.println("\nThe area of the triangle is : " + area((float) 0.5,b,h));
                break;
            case 2:
                System.out.println("\nEnter the radius : ");
                l = sc.nextFloat();
                System.out.println("\nThe area of the circle is : " + area(l,(22/7)));
                break;
            case 3:
                System.out.println("\nEnter the length of the rectangle : ");
                l=sc.nextFloat();
                System.out.println("\nEnter the breadth of the rectangle : ");
                b=sc.nextFloat();
                System.out.println("\nThe area of the Rectangle is : "+ area(b,l));
                break;
            case 4:
                System.out.println("\nEnter the length of the side of square :");
                l=sc.nextFloat();
                System.out.println("\nThe area of the Rectangle is : "+ area(l));
                break;
            case 5:
                System.out.println("\n!!!EXITING!!!");
                break;
            default:
                System.out.println("!!!INVALID!!!");
                break;
            }
        }
    sc.close();
    }
}