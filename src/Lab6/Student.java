package Lab6;
import java.util.Comparator;

public class Student{
    private int ball;
    private String name;
    public int[] IDNumber = {30,40,50,10,90};
    public Student(int ball, String name) {
        this.ball = ball;
        this.name = name;
    }
    public void bubbleSort(){
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for(int i=1;i < IDNumber.length;i++){
                if(IDNumber[i-1]<IDNumber[i]){
                    int x = IDNumber[i-1];
                    IDNumber[i-1]=IDNumber[i];
                    IDNumber[i]=x;
                    sorted = false;
                }
            }

        }
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[id=" + this.ball + ", name=" + this.name + "]";
    }



}
