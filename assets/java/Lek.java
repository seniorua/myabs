import java.util.Scanner;
public class Lek {
    public static void main(String[] args) {
        //напишіть тут ваш код
        System.out.println("Введите три числа");
        System.out.println("Первое число:");
        Scanner scfnum = new Scanner(System.in);
        int fnum = scfnum.nextInt();
        
        System.out.println("Второе чило:");
        Scanner scsnum = new Scanner(System.in);
        int snum = scsnum.nextInt();
        
        System.out.println("Третье число:");
        Scanner sclnum = new Scanner(System.in);
        int lnum = sclnum.nextInt();
        
        if(fnum==snum){
            System.out.print(fnum +" "+ snum);
            if(snum==lnum)
                System.out.println(" "+ lnum);
        }    
        else if(snum==lnum)
            System.out.println(snum +" "+ lnum);
        else if(fnum==lnum)
            System.out.println(fnum +" "+ lnum);
    }
}