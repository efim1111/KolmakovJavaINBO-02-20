package Lab9.ex1;
import Lab9.ex1.InnFormatException;

import java.util.Scanner;


public class TestLab9ex1 {
    public static void main(String[] str) throws InnFormatException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            long inn = Long.parseLong(sc.nextLine());
            int i = (int) Math.log10(inn) + 1;
            if (i != 10 && i != 12) {
                throw new InnFormatException("Неправильный формат ИНН!!!");
            }


        }
    }
}