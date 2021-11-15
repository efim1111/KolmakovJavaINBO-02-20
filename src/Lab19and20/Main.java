package Lab19and20;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        Generator g = new Generator();
        ArrayList<String> nomera = new ArrayList<String>();
        HashSet<String> nomeraForHash = new HashSet<String>();
        TreeSet<String> nomeraForTree = new TreeSet<String>();
        Scanner in = new Scanner(System.in);

        while (i<2000236){
            nomera.add(new String(g.num()));
            nomeraForHash.add(new String(g.num()));
            nomeraForTree.add(new String(g.num()));
            i++;
        }
        System.out.println("Введите номер (используйте русский шрифт): ");
        String nomer = in.next();
        System.out.println("\n");
        long start, finish;
        //ArrayList, (array.contains())
        System.out.println("Поиск прямым перебором по ArrayList, (array.contains())");
        start = System.nanoTime();
        boolean y = nomera.contains(nomer);
        finish  = System.nanoTime();
        if (y)
            System.out.println("Номер:"+ nomer+" найден. Время поиска: "+(finish - start) + "нс\n");
        else
            System.out.println("Номер:"+ nomer+"  НЕ найден. Время поиска: "+(finish - start) + "нс\n");
        //ArrayList, (Collections.binarySearch())
        System.out.println("Поиск бинарным поиском по сортированному ArrayList, (Collections.binarySearch())");
        Collections.sort(nomera);
        start = System.nanoTime();
        int resOfBinarySearch = Collections.binarySearch(nomera,nomer);
        finish  = System.nanoTime();
        if (resOfBinarySearch>=0)
            System.out.println("Номер:"+ nomer+" найден. Его позиция в базе: "+resOfBinarySearch+" Время поиска: "+(finish - start) + "нс\n");
        else
            System.out.println("Номер:"+ nomer+"  НЕ найден. Время поиска: "+(finish - start) + "нс\n");
        //HashSet, (setHash.contains())
        System.out.println("Поиск в HashSet, (setHash.contains())");
        start = System.nanoTime();
        y = nomeraForHash.contains(nomer);
        finish  = System.nanoTime();
        if (y)
            System.out.println("Номер:"+ nomer+" найден. Время поиска: "+(finish - start) + "нс\n");
        else
            System.out.println("Номер:"+ nomer+"  НЕ найден. Время поиска: "+(finish - start) + "нс\n");

        //TreeSet. (setTree.contains())
        System.out.println("Поиск в TreeSet. (setTree.contains())");
        start = System.nanoTime();
        y = nomeraForTree.contains(nomer);
        finish  = System.nanoTime();
        if (y)
            System.out.println("Номер:"+ nomer+" найден. Время поиска: "+(finish - start) + "нс\n");
        else
            System.out.println("Номер:"+ nomer+"  НЕ найден. Время поиска: "+(finish - start) + "нс\n");

    }
}
