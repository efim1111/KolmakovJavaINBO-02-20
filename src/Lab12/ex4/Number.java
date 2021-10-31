package Lab12.ex4;

public class Number {
    private String str, codeCountry, numbers31, numbers32, numbers4;
    public Number(String num){
        this.str=num.replace("8","+7");
        //str.replace("8","+7");
        codeCountry=str.substring(0,2);
        numbers31=str.substring(2,5);
        numbers32=str.substring(5,8);
        numbers4=str.substring(8,12);
    }
    public String toString(){
        return codeCountry + "-" + numbers31 +"-" + numbers32 + "-" + numbers4;
    }

    public static void main(String[] args){
        Number num = new Number("89350920303");
        System.out.println(num.toString());
        Number num2 = new Number("+19350920303");
        System.out.println(num2.toString());
        Number num3 = new Number("+39350920303");
        System.out.println(num3.toString());



    }

}
