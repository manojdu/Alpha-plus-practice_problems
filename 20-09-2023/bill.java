/*Enter cost of 3items from the user(usingfloatdatatype)-apencil,apenandan eraser.
 You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */
import java.util.*;
public class bill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of pencil,pen and a eraser respectively");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = (float)a+b+c;
        float gst = (float)((a+b+c)*18)/100;
        float total=(float)d+gst;
        System.out.println("Total cost of bill is = "+d);
        System.out.println("Gst = "+gst);
        System.out.println("Total amount to be paid(Including GST)= " +total);


        sc.close();


    }
    
}
