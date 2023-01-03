// W pliku Main09.java napisz program rysujący na podstawie wartości zmiennej nponiższy schemat, dla zawartego w metodzie main int n = 5;

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

//        Możesz to zadanie rozwiązać na dwa sposoby:

//        używając pętli zależnych,
//        używając pętli niezależnych i instrukcji warunkowej if.
//        Wzoruj się na poprzednich zadaniach. Trzeba tutaj trochę pomyśleć i rozumieć pętle zagnieżdżone.

package Kontrola_przepływu;
public class Main09 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= j) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
