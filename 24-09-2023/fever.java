/*FinishthefollowingcodesothatitprintsYouhaveafeverifyourtemperatureis above 100 and 
otherwise prints You don't have a fever*/
import java.util.*;
public class fever {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your temperature");
        double temp=sc.nextDouble();
        
        if(temp>100){
            System.out.println("You have a fever");
        }
        else{
            System.out.println("You don't have a fever");
        }
        sc.close();
    }
    
}
