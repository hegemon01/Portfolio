//W pliku Main02.java stwórz tablicę z listą owoców. Tablicę nazwij fruits.
//
//        Następnie:
//
//        Umieść w niej trzy wartości: "apple", "banana", "berry".
//        wypisz w konsoli pierwszy owoc.
//        wypisz w kolejnej lini w konsoli ostatni (skorzystaj z length).
//        w pętli wypisz wszystkie owoce – każdy w nowej linii (skorzystaj z length).
//        Oczekiwany wynik:
//
//        apple
//        berry
//        apple
//        banana
//        berry
       package Tablice;
public class Main02 {
    public static void main(String[] args) {
        String [] fruits = {"apple", "banana", "berry" };
        System.out.println(fruits[0]);
        System.out.println(fruits[2]);

        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
    }

}