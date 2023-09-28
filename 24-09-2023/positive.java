//WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative
import java.util.*;
public class positive {
    public static void main(String args[]){
        System.out.println("Enter a number to check positive or negative");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0){
            System.out.println("The number is negative");
        }
        else if(num>0){
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The number is 0");
        }
        sc.close();
    }
}
