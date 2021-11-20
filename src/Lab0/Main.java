package Lab0;

import Lab21and22.CreateImageDocument;
import Lab21and22.CreateMusicDocument;
import Lab21and22.CreateTextDocument;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Text, Image, Music");
        String nameDocument = in.nextLine();
        switch (nameDocument) {
            case "Text" :
                System.out.println("T");
                break;
            case "Image" :
                System.out.println("I");
                break;
            case "Music" :
                System.out.println("M");
                break;
        }
    }
}
