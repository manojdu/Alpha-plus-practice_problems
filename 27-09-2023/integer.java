//Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers.
import java.util.*;
public class integer {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num;
        int evensum = 0;
        int oddsum=0;
        int choice;
        
        do{
            System.out.println("enter a number");
            num=sc.nextInt();
            if(num%2==0){
                evensum+=num;
            }
            else{
                oddsum+=num;
            }
            System.out.println("Do you want to continue? press 1 or 0 to exit ");
            choice=sc.nextInt();
        
        }while(choice==1);
        System.out.println("Sum of even number "+evensum);
        System.out.println("Sum of odd number "+oddsum);
        sc.close();


        


   }
    
}
