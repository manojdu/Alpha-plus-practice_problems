//WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthatyear is a leap year or not
import java.util.*;
public class leapyear {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a year to find it is leapyear or not");
    int year = sc.nextInt();
    if((year%4)==0 && (year%100)!=0 || (year%400)==0){
        System.out.println("Leap year");
    }
    else{
        System.out.println("not a leap year");
    }

    sc.close();
    
    
}

}
