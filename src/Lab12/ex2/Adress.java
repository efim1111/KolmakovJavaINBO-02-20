package Lab12.ex2;

import java.util.StringTokenizer;

public class Adress{
    private String str, tokenizer, country, region, city, street, house, building, apartment;

    public Adress(String str){
        this.str=str;
        String[] strs = str.split(", ");
        country=strs[0].trim();
        region=strs[1].trim();
        city=strs[2].trim();
        street=strs[3].trim();
        house=strs[4].trim();
        building=strs[5].trim();
        apartment=strs[6].trim();
    }
    public Adress(String str, String tokenizer){
        this.str=str;
        this.tokenizer=tokenizer;
        StringTokenizer strss = new StringTokenizer(str,tokenizer);
        String[] strs = new String[7];
        int i = 0;
        while(strss.hasMoreElements()){
            strs[i]= strss.nextToken();
            i++;
        }
        country=strs[0].trim();
        region=strs[1].trim();
        city=strs[2].trim();
        street=strs[3].trim();
        house=strs[4].trim();
        building=strs[5].trim();
        apartment=strs[6].trim();

    }

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }

    public static void main(String[] args){
        Adress st1 = new Adress("Cтрана, Регион, Город, Улица, Дом, Корпус, Квартира");
        System.out.println(st1.toString());
        Adress st2 = new Adress("Cтрана2. Регион2, Город2; Улица2, Дом2- Корпус2, Квартира2", ".,;-");
        System.out.println(st2.toString());
    }



}