/*Write a program to find the factorialof any number entered by the user.
(Hint:factorialofanumbern=n*(n-1)*(n-2)*(n-3)*......*1andexistsforpositivenumbersonly. 
We write factorial as n!So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same) */
import java.util.*;
public class factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial(positive number)");
        int n = sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println("Factorial:"+fact);
        sc.close();
    }
}
