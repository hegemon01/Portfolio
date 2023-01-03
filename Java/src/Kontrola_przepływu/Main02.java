// W pliku Main02.java stwórz trzy zmienne, o nazwach nr1, nr2, nr3 , przechowujące liczby całkowite o wartościach 3, 7, 11.
//        Następnie za pomocą instrukcji warunkowej if ... else if ... else, wypisz na stronie, która z nich jest największa.
//        Tekst wypisz wg wzoru: Największa z liczb to 11.

package Kontrola_przepływu;

public class Main02 {
    public  static  void  main ( String [] args ) {
        int nr1 = 3;
        int nr2 = 7;
        int nr3 = 11;

        if (nr1 > nr2 && nr1 > nr3) {
            System.out.println("Większa liczba to " + nr1);
        } else if (nr2 > nr3 && nr2 > nr1) {
            System.out.println("Większa liczba to " + nr2);
        } else if (nr3 > nr1 && nr3 > nr2) {
            System.out.println("Większa liczba to " + nr3);
        } else {
            System.out.println("Wszystkie liczby są równe");
        }
    }

}
