package Lab7;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestLab7ex2 {
    Queue<Integer> FirstPlayer, SecondPlayer;

    public TestLab7ex2(String fp, String sp) {
        this.FirstPlayer = new ArrayDeque<>();
        this.SecondPlayer = new ArrayDeque<>();
        for(int i = 0; i < 5; i ++){
            this.FirstPlayer.add(Integer.parseInt(fp.substring(i, i+1)));
            this.SecondPlayer.add(Integer.parseInt(sp.substring(i, i+1)));
        }
    }

    public String play(){
        int count = 0;
        while(!FirstPlayer.isEmpty() && !SecondPlayer.isEmpty() && count < 106){
            if(FirstPlayer.peek() > SecondPlayer.peek()
                    && SecondPlayer.peek() != 0){
                FirstPlayer.add(FirstPlayer.remove());
                FirstPlayer.add(SecondPlayer.remove());

            }else{
                SecondPlayer.add(FirstPlayer.remove());
                SecondPlayer.add(SecondPlayer.remove());
            }
            count++;
        }
        String res = "";
        if(FirstPlayer.isEmpty()) res += "second ";
        else if (SecondPlayer.isEmpty()) res += "first ";
        res += count;
        if(count >= 106) res += " botva";
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new TestLab7ex2("23569", "14780").play());
        System.out.println(new TestLab7ex2("72345", "61890").play());
        System.out.println(new TestLab7ex2("12345", "67890").play());
    }

}
