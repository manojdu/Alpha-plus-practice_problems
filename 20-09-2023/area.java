/*In a program,input the side of asquare.You have to output the area of the square.
(Hint : area of a square is (side x side)) */
import java.util.*;
public class area {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The side of a Square to calculate Area:");
        int len = sc.nextInt();
        int area = len*len;
        System.out.println("Area = "+area);
        sc.close();

    }
    
}
