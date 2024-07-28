import java.util.*;
public class String_meth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str,str1,rev="";
        char ch;
        System.out.println("Enter the string :");
        str = sc.nextLine();
        System.out.println("Length : "+str.length());
        for(int i=1; i<=str.length(); i++){
            ch=str.charAt(str.length()-i);
            rev=rev+ch;
        }
        System.out.println("Reversed string is : "+rev);
        System.out.println("Enter another string : ");
        str1 = sc.nextLine();
        if(str.equals(str1)){
            System.out.println("Same " + str);
        }
        else{
            System.out.println(str);
            System.out.println(str1);
        }
        sc.close();
    }
}
