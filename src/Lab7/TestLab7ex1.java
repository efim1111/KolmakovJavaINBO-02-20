package Lab7;

import java.util.Stack;

public class TestLab7ex1 {
    Stack<Integer> FirstPlayer, SecondPlayer;

    public TestLab7ex1(String fp, String sp) {
        this.FirstPlayer = new Stack<>();
        this.SecondPlayer = new Stack<>();
        for(int i = 4; i >= 0; i --){
            this.FirstPlayer.push(Integer.parseInt(fp.substring(i, i+1)));
            this.SecondPlayer.push(Integer.parseInt(sp.substring(i, i+1)));
        }
    }

    private void pushBack(Stack<Integer> s, Integer item){
        Stack<Integer> abc = new Stack<>();
        while (!s.isEmpty())
            abc.push(s.pop());
        s.push(item);
        while (!abc.isEmpty())
            s.push(abc.pop());
    }

    public String play(){
        int count = 0;
        while(!FirstPlayer.isEmpty() && !SecondPlayer.isEmpty() && count <= 106){
            if(FirstPlayer.peek() > SecondPlayer.peek()
                    && SecondPlayer.peek() != 0){
                pushBack(FirstPlayer, FirstPlayer.pop());
                pushBack(FirstPlayer, SecondPlayer.pop());
            }else{
                pushBack(SecondPlayer, FirstPlayer.pop());
                pushBack(SecondPlayer, SecondPlayer.pop());
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
        System.out.println(new TestLab7ex1("23569", "14780").play());
        System.out.println(new TestLab7ex1("72345", "61890").play());
        System.out.println(new TestLab7ex1("12345", "67890").play());
    }

}
