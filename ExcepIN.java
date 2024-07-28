public class ExcepIN {
    public void authExcep() {
        try {
            int num = 0;
            System.out.println("Result = " + (num / 0));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero detected");
        }
    }

    public void aiobExcep() {
        try {
            int[] num = {1, 2, 3, 4, 5, 6};
            System.out.println("Element at tenth position: " + num[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }
    
    public static void main(String[] args) {
        ExcepIN obj = new ExcepIN();
        obj.authExcep();
        obj.aiobExcep();
    }
}
