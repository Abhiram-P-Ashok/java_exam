import java.util.*;
class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}

public class UserExcep {
    public static void main(String args[]){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age : ");
            if(!sc.hasNextInt()){
                throw new InputMismatchException("Please enter a valid integer for age");
            }

            int age = sc.nextInt();
            if (age<18){
                throw new MyException("You nust be atleast 18 years old");
            }else{
                System.out.println("Welcome! You are old enough");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Input Error: "+ e.getMessage());
        }catch(MyException e){
            System.out.println("Custom Exception : "+ e.getMessage());
        }
    }
}
