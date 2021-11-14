package Lab16;

public class OrderAlreadyAddedException extends Exception {
    private InternetOrder<Item> position;
    private int count;

    public boolean isEmpty(){
        return count==0;
    }
    public void addAfter(Item a, Item b){
    }

    public OrderAlreadyAddedException() {
    }

    public OrderAlreadyAddedException(InternetOrder<Item> position, int count) {
        this.position = position;
        this.count = count;
    }

    public OrderAlreadyAddedException(String message, InternetOrder<Item> position, int count) {
        super(message);
        this.position = position;
        this.count = count;
    }

    public OrderAlreadyAddedException(String message, Throwable cause, InternetOrder<Item> position, int count) {
        super(message, cause);
        this.position = position;
        this.count = count;
    }

    public OrderAlreadyAddedException(Throwable cause, InternetOrder<Item> position, int count) {
        super(cause);
        this.position = position;
        this.count = count;
    }

    public OrderAlreadyAddedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, InternetOrder<Item> position, int count) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.position = position;
        this.count = count;
    }
}