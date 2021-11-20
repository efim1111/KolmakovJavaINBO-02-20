package Lab21and22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Scanner in = new Scanner(System.in);
        String a;
        do {
            frame.New();
            frame.Open();
            frame.Save();
            frame.Exit();
            System.out.println("Создать ещё документ?");
            a = in.nextLine();
        } while(a.equals("Да"));
    }
}
