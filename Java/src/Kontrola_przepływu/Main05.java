// W pliku Main05.java stwórz zmienne resultFor oraz resultWhile i przypisz do nich liczbę 0.
//        Następnie stwórz pętlę, która doda do siebie liczby od 1 do 10 i zapisze do zmiennej resultFor lub resultWhile.
//        Pętla powinna co uruchomienie (zwaną także iteracją pętli) dodawać do zmiennej resultFor lub resultWhile kolejną liczbę z podanego zakresu.
//        Napisz zarówno pętlę for jak i while.
//        Wypisz w konsoli w oddzielnych liniach zmienne: resultFor i resultWhile.
//        Oczekiwany wynik:

//        55
//        55

package Kontrola_przepływu;

public class Main05 {
    public static void main(String[] args) {
        int resultFor = 0;
        int resultWhile = 0;
        for (int i = 1; i <= 10; i++) {
            resultFor = resultFor + i;
        }
        int i = 1;
        while (i <= 10) {
            resultWhile = resultWhile + i;
            i++;
        }
        System.out.println(resultFor);
        System.out.print(resultWhile);
    }
}