/*Write a program to print the multiplication table of anumber N,entered by the user */
import java.util.*;
public class multiplication {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its tables");
        int n = sc.nextInt();
        int mul=0;
        for(int i=1;i<=10;i++){
            mul = n*i;
            System.out.println(+n+" * "+i+" = "+mul);
        }
        

        sc.close();
    }
}
