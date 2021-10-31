package Lab10;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair();

    public MagicChair createMagicanChair();

    public FunctionalChair createFunctionalChair();
}
