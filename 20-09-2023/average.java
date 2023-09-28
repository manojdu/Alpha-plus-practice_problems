/* In a program,input3numbers:A,BandC.Youhavetooutputtheaverageofthese 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N)*/
import java.util.*;
public class average{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to find its average");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a+b+c)/3;
        System.out.println("Average = "+average);
        sc.close();

    }
}