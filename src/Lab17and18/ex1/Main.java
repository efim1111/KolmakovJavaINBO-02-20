package Lab17and18.ex1;

public class Main {
    public static void main(String[] args)
    {
        String input = "abcdefghijklmnopqrstuv18340";
        System.out.println(input);
        boolean result = input.matches("abcdefghijklmnopqrstuv18340");
        if (result) {
            System.out.println("Данная строка является строкой \"abcdefghijklmnopqrstuv18340\"\n");
        } else {
            System.out.println("Данная строка НЕ является строкой \"abcdefghijklmnopqrstuv18340\"\n");
        }
    }
}
