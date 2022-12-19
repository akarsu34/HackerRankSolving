package javasolving;

import java.util.Scanner;

public class CanYouAccess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();

        CanYouAccess access = new CanYouAccess();
        access.run(sayi);
    }

    public void run(int sayi){
        InnerPrivate in = new InnerPrivate();
        in.powerof2(sayi);
        System.out.println("this chench for main");
    }

    class InnerPrivate{

        public  void powerof2(int sayi ) {
            double number = 0;
            for (int i = 0; i < sayi; i++) {
                number = Math.pow(2,i);
                if(number == sayi){
                    System.out.println(sayi + " is power of 2");
                    break;
                }
            }
            if(number != sayi){
                System.out.println(sayi + " is not a power of 2 ");
            }
        }
    }
}
