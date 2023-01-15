import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        System.out.println("Введіть через пробіл три сторони трикутника:");
        Scanner scane = new Scanner(System.in);
        int sa = scane.nextInt();
        int sb = scane.nextInt();
        int sc = scane.nextInt();
        
        if((sa+sb>sc)&&(sa+sc>sb)&&(sb+sc>sa))
            System.out.println("Такий трикутник існує");
        else 
            System.out.println("Такого трикутника не існує...");
    }
}