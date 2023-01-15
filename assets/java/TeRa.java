import java.util.Scanner;
public class TeRa {
    public static void main(String[] args){
        boolean cont = true;
        for(cont==true){    
            System.out.println("Input the temperature:");
            Scanner inp = new Scanner(System.in);
            boolean isint = inp.hasNextInt();
                if(isint == true){
                    int tmpr = inp.nextInt();
                    if(tmpr>0)
                        System.out.println("На вулиці тепло.");
                    else System.out.println("На вулиці холодно.");    
                }
            else {
                System.out.println("Ошибка! Введите температуру правильно.");
                cont = true;
            }
        }
    }
}
