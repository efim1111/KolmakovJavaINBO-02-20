package Lab10;

public class Main {
    public static void main(String[] args) {
        Client firstClient = new Client();
        ChairFactory factory = new ChairFactory();
        firstClient.setChair(factory.createMagicanChair());
        ((MagicChair) firstClient.chair).doMagic();
        firstClient.setChair(factory.createFunctionalChair());
        int summa = ((FunctionalChair) firstClient.chair).sum(15, 3);
        System.out.println("Summa:  " + summa);
        firstClient.setChair(factory.createVictorianChair());
        ((VictorianChair) firstClient.chair).setAge(67);
        int age = ((VictorianChair) firstClient.chair).getAge();
        System.out.println("Age: " + age);
    }
}

