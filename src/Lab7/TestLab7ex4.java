package Lab7;

import java.util.LinkedList;

public class TestLab7ex4 {
    LinkedList<Integer> FirstPlayer, SecondPlayer;

    public TestLab7ex4(String fp, String sp) {
        this.FirstPlayer = new LinkedList<>();
        this.SecondPlayer = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            this.FirstPlayer.add(Integer.parseInt(fp.substring(i, i + 1)));
            this.SecondPlayer.add(Integer.parseInt(sp.substring(i, i + 1)));
        }
    }


    public String play() {
        int count = 0;
        while (!FirstPlayer.isEmpty() && !SecondPlayer.isEmpty() && count <= 106) {
            if (FirstPlayer.peek() <= SecondPlayer.peek()
                    || SecondPlayer.peek() == 0) {
                        SecondPlayer.add(FirstPlayer.remove());
                        SecondPlayer.add(SecondPlayer.remove());
                    } else {
                FirstPlayer.add(FirstPlayer.remove());
                FirstPlayer.add(SecondPlayer.remove());

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
        System.out.println(new TestLab7ex4("83469", "17520").play());
        System.out.println(new TestLab7ex4("72345", "61890").play());
        System.out.println(new TestLab7ex4("12345", "67890").play());

    }
}
