// Write a method to print all odd numbers from 1 to a given number n
import java.util.Scanner;
public class Odd {
    public static void OddCheck(int a){
        for(int i = 1; i <= a; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        OddCheck(a);
    }
}
