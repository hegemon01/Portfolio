//W pliku Main06.java
//
//        Stwórz tablicę z liczbami (4, 643, 112, 9999, -69), tablicę nazwij numbers.
//        Wypisz elementy tablicy od końca, używając pętli for – każdy element w nowej linii.
//        Oczekiwany wynik:
//
//        -69
//        9999
//        112
//        643
//        4

package Tablice;

public class Main06 {
    public static void main(String[] args) {
        int[] numbers = {4, 643, 112, 9999, -69};

        for(int i = numbers.length - 1;i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }

}
