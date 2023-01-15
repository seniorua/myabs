import java.util.Scanner;
public class T {
    public static void main(String[] args) {
        System.out.println("Input the temperature:");
        Scanner console = new Scanner(System.in);
        int tmpr = console.nextInt();
        if(tmpr>0)
            System.out.println("it's warm!");
        else
            System.out.println("It is cold...");
    }
}
